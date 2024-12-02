import Entity.TestClass;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConstructorTest {
    @Test
    public void testGetConstructors() throws Exception {
        Class<TestClass> myClass = TestClass.class;
        //Constructor<?>[] constructors = myClass.getConstructors();//获取全部的public构造函数
        Constructor<?>[] constructors = myClass.getDeclaredConstructors();//获取全部的构造函数
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName()+"参数个数："+constructor.getParameterCount());
        }
        System.out.println("=====================================");
        Constructor<TestClass> con =
                myClass.getConstructor(String.class,String.class,Integer.class,String.class);//获取某个public构造器

        Constructor<TestClass> con2 =
                myClass.getDeclaredConstructor(String.class,String.class);//获取某个构造器

        Constructor<TestClass> conn = myClass.getConstructor();
        System.out.println(conn.getName()+"参数个数："+conn.getParameterCount());
        System.out.println("================================");
        System.out.println(con.getName()+"参数个数："+con.getParameterCount());
        System.out.println("================================");
        System.out.println(con2.getName()+"参数个数："+con2.getParameterCount());

        TestClass testClass = conn.newInstance();
        System.out.println(testClass);
        System.out.println("=========================");
        con2.setAccessible(true);//禁止访问检查，即暴力反射
        TestClass testClass1 = con2.newInstance("芜湖", "男");
        System.out.println(testClass1);
    }
}
