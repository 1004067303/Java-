import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class activeProxy {
    public static void main(String[] args) throws Exception {
        /*
        ClassLoader loader,
        Class<?>[] interfaces,
I       nvocationHandler h
         */
        Star obj =(Star) Class.forName("Star").getConstructor(String.class).newInstance("起飞");
        Star face =   Star.class.getConstructor().newInstance();
        //动态生成的代理类
        Face o =(Face) Proxy.newProxyInstance(Star.class.getClassLoader(), new Class[]{Face.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("sing")) {
                    System.out.println("代理收钱10万出场费（唱歌）！！！");
                }
                else if (method.getName().equals("dance")){
                    System.out.println("代理收钱5万出场费（跳舞）！！！");
                }
                return method.invoke(obj);
            }
        });
        o.sing();
        o.dance();

    }
}
