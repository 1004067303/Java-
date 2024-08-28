package Collections;

import java.util.ArrayList;

public class CollectionExceptionDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("张无忌");
        list.add("李四");
        list.add("王二");
        list.add("王进");
        list.add("李天");
        list.add("曲金");
        System.out.println(list);
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String name = it.next();
            if(name.contains("李")){
                //list.remove(name);//会抛异常
                it.remove();//不会抛异常，正常删除
            }
        }*/
      /*  for (int i = 0; i < list.size(); i++) {
            String name= list.get(i);
            if(name.contains("张")){
                list.remove(i);
                i--;//不加就会漏删数据
            }
        }*/
        //倒着删除也行
        for (int i = list.size()-1; i >=0 ; i--) {
            String name= list.get(i);
            if(name.contains("曲")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
