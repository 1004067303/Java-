import Entity.TestClass;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FieldTest {
    @Test
    public void testField() throws Exception {
        Class myClass = TestClass.class;//获取Class对象

        Field[] PFields = myClass.getFields();//获取所有的成员变量（public修饰）
        Field[] AFields = myClass.getDeclaredFields();//获取所有的成员变量
        System.out.println("所有public修饰的成员变量");
        for (Field field : PFields) {
            System.out.println(field.getName()+"类型为："+field.getType());
        }
        System.out.println("==========================");
        System.out.println("所有的成员变量");
        for (Field field : AFields) {
            System.out.println(field.getName()+"类型为："+field.getType());
        }
        //对于非public修饰的成员变量，使用getDeclaredField(String name) 获取，一般建议直接使用
        Field FName = myClass.getField("name");
        Field FSex = myClass.getField("sex");
        Field FAge = myClass.getDeclaredField("age");
        Field FAddress = myClass.getDeclaredField("address");

        Constructor o = myClass.getConstructor();
        TestClass con = (TestClass) o.newInstance();
        System.out.println("未赋值前："+con);
        FName.set(con,"芜湖");
        FSex.set(con,"男");
        FAge.setAccessible(true);
        FAge.set(con,24);//需要禁止检查访问控制
        FAddress.setAccessible(true);
        FAddress.set(con,"芜湖");//需要禁止检查访问控制
        System.out.println("赋值后："+con);
    }
}
