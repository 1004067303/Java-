package Collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethods
{
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("起飞");
        list.add(0,"芜湖");
        list.add("牛掰");
        list.add(0,"你在赣神魔");
        list.add("小老板");
        list.add("有问题");
        System.out.println(list.get(0));
        System.out.println("======================");
        System.out.println("被删除0号位置的元素："+list.remove(0));
        System.out.println("被修改0号位置的元素："+list.set(0,"吴迪！！"));
        //普通for  适用于有索引
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("====================");
        //增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("====================");
        //迭代器方法遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("======================");
        //foreach
        list.forEach(s-> System.out.println(s));
    }
}
