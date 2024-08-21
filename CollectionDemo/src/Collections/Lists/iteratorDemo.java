package Collections.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class iteratorDemo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<String>();//多态写法，便于切换
        list.add("王老霉");
        list.add("王老霉");
        list.add("加少宝");
        list.add("雷碧");
        list.add("可恨");
        Iterator<String> iter = list.iterator();
      /*  System.out.println("获取第一个元素："+iter.next());
        System.out.println("获取第二个元素："+iter.next());
        System.out.println("获取第三个元素："+iter.next());
        System.out.println("获取第四个元素："+iter.next());
        System.out.println("获取第五个元素："+iter.next());*/
        //System.out.println("获取第六个元素："+iter.next());//会报异常，出错  NoSuchElementException
        int i=1;
        while(iter.hasNext()){
            System.out.println("获取第"+i+"个元素："+iter.next());
            i++;
        }
        System.out.println("======================");
        for (String s : list) {
            System.out.println("获取元素："+s);
        }
        System.out.println("======================");
        String[] slist= {"sd","das","dasd"};
        for (String s : slist) {
            System.out.println("获取元素："+s);
        }
        System.out.println("======================");
        //增强for 以及简化（函数式接口）
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.forEach((String s) ->{
                System.out.println(s);
            }
        );
        list.forEach(s->System.out.println(s));
        //
        list.forEach(System.out::println);
    }
}
