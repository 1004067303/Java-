package com.Jha.Obj.arrayList;

import java.util.ArrayList;

public class arrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);
/*        for (int i=0;i<list.size();i++)
        {
            if( list.get(i).contains("枸杞"))
            {
                list.remove(i);
                i--;
            }
        }*/
        for (int i= list.size()-1;i>=0;i--)
        {
            if( list.get(i).contains("枸杞"))
            {
                list.remove(i);

            }
        }

       /* for (String s : list) {
           if( s.contains("枸杞"))
           {
               list.remove(s);
           }
        }*/
        System.out.println(list);
    }
}
