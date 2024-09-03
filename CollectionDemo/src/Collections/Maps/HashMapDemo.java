package Collections.Maps;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //Map<String,Integer> map=new HashMap<>();//可以看出，是无序的，且不重复，重复的话就会被认为是更新，取最新的一个
        Map<String,Integer> map=new LinkedHashMap<>();//可以看出，是有序的，且不重复，重复的话就会被认为是更新，取最新的一个
        Map<String,Integer> map2=new LinkedHashMap<>();
        map2.put("芜湖",411);
        map2.put("wd",5);
        map2.put("起飞",233);
        map.put("芜湖",1);
        map.put("芜湖",2);
        map.put("芜湖",3);
        map.put("芜湖",4);
        map.put("芜湖",5);
        map.put("起飞",2);
        map.put("小老板",5);
        map.put("测试",3);
        map.put(null,null);
        System.out.println(map);

        System.out.println("map的大小："+map.size());
        map.clear();//清空map
        System.out.println("清空map");
        System.out.println("map的大小："+map.size());
        System.out.println("map是否为空："+map.isEmpty());
        map.put("芜湖",5);
        map.put("起飞",2);
        map.put("小老板",5);
        map.put("测试",3);
        System.out.println("重新赋值map！");
        System.out.println(map);
        System.out.println("获取键芜湖的值："+map.get("芜湖"));
        System.out.println("移除键芜湖："+map.remove("芜湖"));
        System.out.println(map);
        System.out.println("是否存在键小老板："+map.containsKey("小老板"));
        System.out.println("是否存在键芜湖："+map.containsKey("芜湖"));
        System.out.println("是否存在值5："+map.containsValue(5));
        System.out.println("是否存在值6："+map.containsValue(6));
        Set<String> strings = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println("获取map的所有键，以Set集合的形式："+strings);
        System.out.println("获取map的所有值，以Collection集合的形式："+values);
        System.out.println("赋值前："+map);
        map.putAll(map2);
        System.out.println("赋值的map："+map2);
        System.out.println("赋值后："+map);

        Map<Integer,String> tree=new TreeMap<>();//可排序，无重复，无索引，通过键来进行排序的
        tree.put(58,"A");
        tree.put(8,"B");
        tree.put(5,"C");
        tree.put(58,"D");
        tree.put(52,"E");
        System.out.println(tree);
    }
}
