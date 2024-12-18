import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class junitFrameDemo {
    @myAnnotation3
    public void test1(){
        System.out.println("test1执行！！！！！！！！！！！！！");
    }
    @myAnnotation3
    public void test2(){
        System.out.println("test2执行！！！！！！！！！！！！！");
    }
    //@myAnnotation3
    public void test3(){
        System.out.println("test3执行！！！！！！！！！！！！！");
    }
    @myAnnotation3
    public void test4(){
        System.out.println("test4执行！！！！！！！！！！！！！");
    }

    public static void main(String[] args) throws Exception {
        Class<junitFrameDemo> myclass = junitFrameDemo.class;
        Constructor<junitFrameDemo> constructor = myclass.getConstructor();
        junitFrameDemo jDemo = constructor.newInstance();
        Method[] methods = myclass.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(myAnnotation3.class)){
                method.invoke(jDemo);
            }
        }

    }
}
