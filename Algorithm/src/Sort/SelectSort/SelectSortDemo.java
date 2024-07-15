package Sort.SelectSort;


import UtilsDemo.UtlisDemo;

import java.util.Arrays;

public class SelectSortDemo {
    public static void main(String[] args) {
        int[] list=new int[]{1,2,42,21,4,2,50,12,54,51,5};
        int[] array = UtlisDemo.getArray(5000, 1, 100000);
        double start = System.currentTimeMillis();
        System.out.println("开始时间："+(start));
        System.out.println("================");
        System.out.println(Arrays.toString(selectSort(list)));
        //System.out.println(Arrays.toString(selectSort(array)));
       /* Arrays.sort(array);
        System.out.println(Arrays.toString(selectSort(array)));*/

        double end = System.currentTimeMillis();
        System.out.println("结束时间："+(end));
        System.out.println("用时："+((end-start)/1000));


    }
    static int [] selectSort(int[] num){
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < num.length-1; i++) {
            int min=i;
            // 每轮需要比较的次数 N-i
            for (int j=i+1;j<num.length;j++)
            {
                if(num[j]<num[min])
                {
                    // 记录目前能找到的最小值元素的下标
                    min=j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换,加判断减少交换次数
            if (i != min) {
                int tmp = num[i];
                num[i] = num[min];
                num[min] = tmp;
            }
            //System.out.println(Arrays.toString(num));
        }

        return num  ;
    }
}
