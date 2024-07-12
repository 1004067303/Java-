package BubblingAlgorithm;

import java.util.Arrays;

public class BubblingAlgorithmDemo {
    public static void main(String[] args) {
        int[] list=new int[]{1,2,42,21,4,2,50,12,54,51,5};
        System.out.println(Arrays.toString(Bubbling(list)));
    }
    /*
    冒泡排序，通过循环，每次拿到最大数，放到末尾，然后长度减一，在进行排序
     */
    static int[] Bubbling(int[] t){
        if(t!=null) {
            int temp = 0;
            for(int j=0;j< t.length-1;j++) {
                for (int i = 1; i <= t.length - 1; i++) {
                    if (t[i - 1] > t[i]) {
                        temp = t[i];
                        t[i] = t[i - 1];
                        t[i - 1] = temp;
                    }
                }
            }
            return t;
        }
        else {
            return null;
        }
    }
}
