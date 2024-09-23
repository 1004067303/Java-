package PropertiesFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        System.out.println(p);
        try (FileReader read= new FileReader("SpecialFile/src/PropertiesFile/users.properties");
        ){
            p.load(read);
            System.out.println(p);
            System.out.println(p.getProperty("test"));
            System.out.println(p.getProperty("测试"));
            /*p.forEach((k,v)->
                    System.out.println(k+":"+v));*/
            System.out.println("===========");
            //添加数据
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter writer=new FileWriter("SpecialFile/src/PropertiesFile/users.properties");
        p.setProperty("芜湖2","起飞！");
        System.out.println("添加之后的："+p);
        p.store(writer,"添加了属性");
    }
}
