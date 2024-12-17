import Entity.TestClass;
import org.junit.Test;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class simpleFrame {
    public static void saveClass(Object obj) throws Exception {
        Class<?> myClass = obj.getClass();//获取对象的Class对象
        System.out.println(obj);
        FileWriter ou=new FileWriter("./src/data.txt",true);
        PrintWriter out=new PrintWriter(ou);
        //获取所有的成员变量
        Field[] fields = myClass.getDeclaredFields();
        out.println("《=======================》");
        out.println("类名："+myClass.getSimpleName());
        //将成员变量写入文件
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(obj);
            out.println(name+"="+value);
        }

        ou.close();
        out.close();
    }
    @Test
    public void testSaveClass() throws Exception {
        TestClass t=new TestClass("芜湖","男",24,"芜湖");
        TestClass t2=new TestClass("芜湖1","男",34,"芜1湖");
        simpleFrame.saveClass(t);
        simpleFrame.saveClass(t2);
    }
}
