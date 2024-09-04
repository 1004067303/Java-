package Collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterator {
    public static void main(String[] args) {
        //用于Map集合的遍历
        Map<String,Double> map=new HashMap<>();
        map.put("芜湖",198.0);
        map.put("起飞",188.0);
        map.put("芜湖",177.0);
        map.put("小老板",168.0);
        map.put("赣神魔",178.0);
        System.out.println(map);
        //通过KeySet 获取所有的键，通过键来使用增强for进行遍历
        {
            Set<String> keys = map.keySet();
            System.out.println("所有的键：" + keys);
            for (String key : keys) {
                System.out.println(key + "值为：" + map.get(key));
            }
        }
        System.out.println("=========================");
        //通过entrySet 获取所有的entry实体，然后就可以使用增强for进行遍历
        {
            Set<Map.Entry<String, Double>> entry = map.entrySet();
            System.out.println("entry的值："+entry);
            for (Map.Entry<String, Double> e : entry) {
                //System.out.println(e);
                System.out.println(e.getKey() + "值为：" + e.getValue());
            }
        }
        System.out.println("=========================");
        //使用lambda表达式进行遍历Map   JDK8之后支持的
        {
           /* map.forEach(new BiConsumer<String, Double>() {
                @Override
                public void accept(String s, Double aDouble) {
                    System.out.println("键为："+s+",值为："+aDouble);
                }
            });*/
            map.forEach((k,v)-> System.out.println("键为："+k+",值为："+v));
        }
    }
}
