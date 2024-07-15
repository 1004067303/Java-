package Sort.ShellSort;

import java.util.Arrays;

public class ShellSortDemo {
    public static void main(String[] args) {
        int[] list=new int[]{1,2,42,21,4,2,50,12,54,51,5};
        Shell(list);
        System.out.println(Arrays.toString(list));
    }
    public static void Shell(int[] array2) {
        int gap = array2.length;//为数组的长度 - 为10
        while (gap > 1) {
            gap /= 2;//先是分成了5组，然后是2组，再是1组
            ShellSort(array2,gap);//调用直接插入排序方法
        }
    }


    static int[] ShellSort(int[] array2,int gap){

        for (int i = gap; i < array2.length ; i++) {
            int tmp = array2[i];//tmp存放i下标的值
            int j = i - gap;//j下标为i-gap个位置
            //j每次-gap个位置
            for (; j >= 0; j-=gap) {
                if (array2[j] > tmp) {
                    //j下标的值大，将j下标的值放到j变量加上一个gap的位置上
                    array2[j + gap] = array2[j];
                }else {
                    //j下标的值较小，j下标的值要直接放到j变量加上一个gap的位置上
                    break;
                }
            }
            //此时j下标的值是负数了，将tmp的值放到j变量加上一个gap的位置上
            array2[j + gap] = tmp;
            //System.out.println(Arrays.toString(array2));
        }
        return  array2;
    }
}
