package Sort.InsertSort;

import UtilsDemo.UtlisDemo;

import java.util.Arrays;

public class InsertSortDemo {
    public static void main(String[] args) {
        int[] list=new int[]{1,2,42,21,4,2,50,12,54,51,5};
        int[] array = UtlisDemo.getArray(5000, 1, 100000);
        double start = System.currentTimeMillis();
        System.out.println("开始时间："+(start));
        System.out.println("================");
        //System.out.println(Arrays.toString(InsertSort(list)));
        System.out.println(Arrays.toString(InsertSort(array)));


        double end = System.currentTimeMillis();
        System.out.println("结束时间："+(end));
        System.out.println("用时："+((end-start)/1000));

    }
    /*
    插入排序，从第二个数开始，将第一个数看做为有序序列，后面的看为无序序列，然后取无序序列的第一个数去和有序序列的最后一个数开始比较，插入相应的位置
    1,2,5,3
    1,2,5,3
    1,2,3,5
     */
    static int[] InsertSort(int[] num){
        for (int i = 1; i < num.length; i++) //共N-1次插入，从第二个数开始，判断和左边有序序列大小关系进行插入
        {
            for(int j=i;j>0;j--)//同步无序序列首位数开始进行判断，依次递减，知道第一位数字进行判断
            {
                if (num[j-1] > num[j]) {
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
            //System.out.println(Arrays.toString(num));
        }
        return num  ;
    }
}
