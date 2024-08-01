package Collections.Lists;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        //可重复，有序，有索引Collection
        Collection<String> list=new ArrayList<String>();//多态写法，便于切换
        list.add("王老霉");
        list.add("王老霉");
        list.add("加少宝");
        list.add("雷碧");
        list.add("可恨");
        System.out.println("有序集合："+list);
        list.clear();
        System.out.println("清除之后的列表："+list);
        list.add("可恨");
        list.add("雷碧");
        list.add("王老霉");
        list.add("王老霉");
        list.add("加少宝");
        System.out.println("新添加之后的列表："+list);
        list.remove("雷碧");
        list.remove("王老霉");
        System.out.println("移除部分之后的列表："+list);
        System.out.println("列表是否为空："+list.isEmpty());
        System.out.println("列表大小："+list.size());
        System.out.println("列表是否存在 可恨："+list.contains("可恨"));



        Object[] s=list.toArray();
        System.out.println("转为数组："+Arrays.toString(s));
        //不可重复，无序，无索引
        Collection<String> set=new HashSet<String>();
        set.add("王老霉");
        set.add("王老霉");
        set.add("加少宝");
        set.add("雷碧");
        set.add("可恨");
        System.out.println("无序集合："+set);
    }
}
