package Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr={24,524,53,633};

        System.out.println(Arrays.toString(arr));
        //拷贝数据，从--开始 到--结束 包前不包后
        int[] demos = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(demos));
        //拷贝数据，并给出长度
        int[] ints = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(ints));

        double[] arr2={2.4,99993.54,44.4,555.4,10000};
        //设置所有数据，通过匿名内部类进行操作，看源码，内部是循环
    /*    Arrays.setAll(arr2, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return arr2[value]*0.8;
            }
        });*/
        Arrays.setAll(arr2, (int value)-> {
                return arr2[value]*0.8;
        });
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
    }
}
