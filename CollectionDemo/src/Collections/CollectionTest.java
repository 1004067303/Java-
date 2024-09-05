package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionTest {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map=new HashMap<>();
        ArrayList<String> info1=new ArrayList<>();
        ArrayList<String> info2=new ArrayList<>();
        ArrayList<String> info3=new ArrayList<>();
        Collections.addAll(info1,"南京市","扬州市","苏州市","无锡市","常州市");
        Collections.addAll(info2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(info3,"石家庄市","唐山市","邢台市","保定市","张家口市");
        map.put("江苏省",info1);
        map.put("湖北省",info2);
        map.put("河北省",info3);
        System.out.println(map);
        System.out.println("湖北省的市："+map.get("湖北省"));
    }
}
