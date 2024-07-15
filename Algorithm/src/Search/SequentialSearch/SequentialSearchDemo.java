package Search.SequentialSearch;

import java.util.Arrays;

public class SequentialSearchDemo {
    public static void main(String[] args) {
        int[] list=new int[]{1,2,42,21,4,2,50,12,54,51,5};
        System.out.println("数组为："+Arrays.toString(list));
        System.out.println("查找的数据为："+SequentialSearch(list, 51));
    }
    static int SequentialSearch(int[] list,int num){
        int n=-1;
        int flag=-1;
        for (int i = 0; i < list.length; i++) {
            if(list[i]==num)
            {
                n= list[i];
                flag=i;
                break;
            }
            else {
                n=-1;

            }
        }
        if(n!=-1)
        {
            System.out.println("数据的索引为："+flag);
        }
        else {
            System.out.println("未找到数据："+num );
        }
        return n;
    }
}
