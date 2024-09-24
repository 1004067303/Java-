package XmlFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateXml {
    /**
     * 将xml格式的字符串写入到xml文件中去
     * <?xml version="1.0" encoding="UTF-8" ?>
     *     <user>
     *             <name> 测试</name>
     *             <age>24</age>
     *             <math>87</math>
     *             <msg>特殊字符 3>2&lt;&gt;&amp;</msg>
     *     </user>
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        StringBuilder msg = s.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n")
                .append("<user>\r\n").append("<name> 测试</name>\r\n").append("<msg>特殊字符 3>2&lt;&gt;&amp;</msg>\r\n")
                .append("</user>");
        System.out.println(msg);
        try( BufferedWriter bw=new BufferedWriter(new FileWriter("SpecialFile/src/XmlFile/create.xml"));) {
           bw.write(msg.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
