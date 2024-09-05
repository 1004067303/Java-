package Streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Collection单列集合获取Stream流
        {
            //找出名字带有张，且名字是三个字的人
            List<String> list = new ArrayList<>();
            list.add("张三");
            list.add("张三丰");
            list.add("李四");
            list.add("张无忌");
            list.add("李秋");
            list.add("周芷若");
            System.out.println(list);
            for (String s : list) {
                if (s.startsWith("张") && s.length() == 3) {
                    System.out.print(s + "   ");
                }
            }
            System.out.println();
            Stream<String> stream = list.stream();
            List<String> list1 = stream.filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).toList();
            System.out.println(list1);
        }
        //Map双列集合获取Stream流
        {
            Map<String, Integer> map = new HashMap<>();
            map.put("张三", 23);
            map.put("张三丰", 21);
            map.put("张无忌", 15);
            map.put("李四", 56);
            map.put("周芷若", 17);
            map.put("芜湖", 23);
            map.put("赣神魔", 43);
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            Stream<Map.Entry<String, Integer>> stream2 = entries.stream();
//        List<Map.Entry<String, Integer>> eList = stream2.filter(s -> s.getKey().startsWith("张")).filter(s -> s.getKey().length() == 3).toList();
//        System.out.println(eList);
            stream2.filter(s -> s.getKey().startsWith("张")).forEach((s) -> {
                System.out.println("键为：" + s.getKey() + " 值为：" + s.getValue());
            });
        }
        //数组获取Stream流，两种方法
        {
            String[] arr = {"张三", "张三丰", "张无忌", "李四", "周芷若"};
            System.out.println("数组：" + Arrays.toString(arr));
            Stream<String> stream1 = Arrays.stream(arr);
            List<String> list2 = stream1.filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).toList();
            System.out.println("Arrays方法：" + list2);
            Stream<String> arr1 = Stream.of(arr);
            List<String> list3 = arr1.filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).toList();
            System.out.println("of方法：" + list3);
        }
    }
}
