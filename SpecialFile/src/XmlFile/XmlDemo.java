package XmlFile;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XmlDemo {
    public static void main(String[] args) throws Exception {
        SAXReader read=new SAXReader();
        Document doc = read.read("SpecialFile/src/XmlFile/users.xml");
        //获取根元素
        Element root = doc.getRootElement();
        System.out.println("根元素的名字："+root.getName());
        //获取根元素下所有子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println("根元素下所有子元素："+ element.getName());
        }
        //获取指定子元素集合
        List<Element> users = root.elements("user");
        for (Element user : users) {
            System.out.println("根元素下指定子元素："+user.getName()+"值为："+user.elementTextTrim("name"));
        }
        //获取指定子元素
        Element user = root.element("user");
        System.out.println("根元素下指定子元素："+user.getName()+"值为："+user.elementText("name"));
        //获取属性列表
        List<Attribute> attributes = user.attributes();
        for (Attribute attribute : attributes) {
            System.out.println("属性为："+attribute.getName()+",值为："+attribute.getText());
        }
        //获取单个属性
        Attribute id = user.attribute("id");
        System.out.println("单个属性为："+id.getName()+",值为："+id.getText());
    }
}
