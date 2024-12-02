import Entity.TestClass;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodTest {
    @Test
    public void testMethod() throws Exception {
        Class<TestClass> myClass = TestClass.class;
        Method[] pMethods = myClass.getMethods();
        Method[] aMethods = myClass.getDeclaredMethods();
        for (Method pMethod : pMethods) {
            System.out.println(pMethod.getName()+"参数个数："+pMethod.getParameterCount()+"返回类型："+pMethod.getReturnType());
        }
        System.out.println("=====================");
        for (Method aMethod : aMethods) {
            System.out.println(aMethod.getName()+"参数个数："+aMethod.getParameterCount()+"返回类型："+aMethod.getReturnType());
        }
        System.out.println("=====================");
        Method me1=myClass.getMethod("showMsg");//获取指定方法
        System.out.println(me1.getName()+"参数个数："+me1.getParameterCount()+"返回类型："+me1.getReturnType());
        System.out.println("=====================");
        Method me2=myClass.getDeclaredMethod("showMsg",String.class);//获取指定方法
        System.out.println(me2.getName()+"参数个数："+me2.getParameterCount()+"返回类型："+me2.getReturnType());
        System.out.println("=====================");
        Method me3 = myClass.getDeclaredMethod("methodDemo");
        System.out.println(me3.getName()+"参数个数："+me3.getParameterCount()+"返回类型："+me3.getReturnType());
        System.out.println("=====================");

        Constructor<TestClass> ctor = myClass.getDeclaredConstructor(String.class,String.class);
        ctor.setAccessible(true);
        TestClass testClass = ctor.newInstance("芜湖","男");
        Method ageSet=myClass.getDeclaredMethod("setAge", int.class);//获取指定方法
        ageSet.invoke(testClass,25);//设置年龄

        Object o1 = me1.invoke(testClass);
        System.out.println("出参为："+o1);
        System.out.println("=====================");
        me2.setAccessible(true);
        Object o2 = me2.invoke(testClass,"起飞咯！！");
        System.out.println("出参为："+o2);
        System.out.println("=====================");
        me3.setAccessible(true);
        Object o3 = me3.invoke(testClass);
        System.out.println("出参为："+o3);
    }
}
