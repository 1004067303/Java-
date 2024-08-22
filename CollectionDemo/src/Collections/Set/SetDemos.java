package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemos {
    public static void main(String[] args) {
        Set<String> hashSet=new HashSet<>();
        hashSet.add("芜湖");
        hashSet.add("芜湖");
        hashSet.add("起飞！！");
        hashSet.add("芜湖");
        hashSet.add("小老板！");
        hashSet.add("芜湖");
        hashSet.add("芜湖");
        System.out.println(hashSet);//[小老板！, 芜湖, 起飞！！] 可以看出是无重复，无顺序的

        Set<Integer> tree=new TreeSet<>();
        tree.add(23);
        tree.add(2312);
        tree.add(2);
        tree.add(4);
        tree.add(5);
        tree.add(55);
        tree.add(23);
        System.out.println(tree);//[2, 4, 5, 23, 55, 2312] 可以看出同样是无重复，但是是有序的，默认升序排序
        Set<String> tree2=new TreeSet<>();
        tree2.add("we");
        tree2.add("qwe");
        tree2.add("asd");
        tree2.add("232");
        tree2.add("231");
        tree2.add("232");
        tree2.add("232");
        System.out.println(tree2);//[231, 232, asd, qwe, we] 可以看出同样是无重复，但是是有序的，默认升序排序，非数字的话就是ascll码表排序


    }
}
