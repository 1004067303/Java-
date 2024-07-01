package com.Jha.Base;

import java.util.ArrayList;

public class encryptDemo {
    public static void main(String[] args) {
        int password=1983;
        ArrayList<Integer> key=new ArrayList<Integer>();
        //int[] key=new int[4];

        key.add(0, (password / 1000) % 10);
        key.add(1, (password / 100) % 10);
        key.add(2, (password / 10) % 10);
        key.add(3, password % 10);
        /*key[0] = (password / 1000)%10;
        key[1] = (password / 100)%10;
        key[2] = (password / 10) % 10;
        key[3] = password  % 10;*/
        ArrayList<Integer> pass=new ArrayList<Integer>();
        for (int i=0;i<key.size();i++)
        {
            pass.add(i,(key.get(i) + 5) % 10)  ;
        }

        ArrayList<Integer> list = InvertedArrayList(pass);

        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"");
        }


    }
    public static ArrayList<Integer> InvertedArrayList(ArrayList<Integer> pass )
    {
        for (int i=0,j=(pass.size()-1);i<j;i++,j--)
        {
            int temp=pass.get(i);
            pass.set(i,pass.get(j));
            pass.set(j,temp) ;
        }
        return pass;
    }
}
