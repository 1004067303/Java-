package Sort.BubblingSort;

import UtilsDemo.UtlisDemo;

import java.util.Arrays;

public class BubblingSortDemo {
    public static void main(String[] args) throws InterruptedException {
        int[] list=new int[]{1,2,42,21,4,2,50,12,54,51,5};
        int[] array = UtlisDemo.getArray(5000, 1, 100000);
        double start = System.currentTimeMillis();
        System.out.println("开始时间："+(start));
        System.out.println("================");
        //System.out.println(Arrays.toString(Bubbling(list)));
        System.out.println(Arrays.toString(Bubbling(array)));
        double end = System.currentTimeMillis();
        System.out.println("结束时间："+(end));
        System.out.println("用时："+((end-start)/1000));
    }
    /*
    冒泡排序，通过循环，每次拿到最大数，放到末尾，然后长度减一，在进行排序
     */
    static int[] Bubbling(int[] t){
        if(t!=null) {
            int temp = 0;
            for(int j=0;j< t.length-1;j++) //外层循环，定义要找多少次最大值，一般为长度-1
            {
                for (int i = 0; i < t.length - 1-j; i++) //内层循环，判断大小进行数组交换，需要减去已经放到最后的位数
                {
                    if (t[i] > t[i+1]) {
                        temp = t[i];
                        t[i] = t[i +1];
                        t[i + 1] = temp;
                    }
                }
                //System.out.println(Arrays.toString(t));
            }
            return t;
        }
        else {
            return null;
        }
    }
}
