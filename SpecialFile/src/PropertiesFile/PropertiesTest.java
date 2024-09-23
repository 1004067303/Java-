package PropertiesFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
        FileReader read=new FileReader("SpecialFile/src/PropertiesFile/users.txt");
        p.load(read);
        System.out.println(p);
        System.out.println(p.getProperty("芜湖"));
        p.setProperty("添加","2");
        p.store(new FileWriter("SpecialFile/src/PropertiesFile/users.txt"),"添加信息");
    }
}
