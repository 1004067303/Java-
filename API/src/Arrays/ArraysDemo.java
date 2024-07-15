package Arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr={24,524,53,633};
        //拷贝数据，从--开始 到--结束 包前不包后
        int[] demos = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("原数组为："+Arrays.toString(demos));
        System.out.println("拷贝[1,3)的数组："+Arrays.toString(demos));
        //拷贝数据，并给出长度
        int[] ints = Arrays.copyOf(arr, 10);
        System.out.println("拷贝该数组长度为10："+Arrays.toString(ints));
        int[] ints2 = Arrays.copyOf(arr, 3);
        System.out.println("拷贝该数组长度为3："+Arrays.toString(ints2));
        Arrays.sort(arr);
        System.out.println("排序后的数组："+Arrays.toString( arr));
        double[] arr2={2.4,99993.54,44.4,555.4,10000};
        System.out.println("arr2数组："+Arrays.toString(arr2));
        //设置所有数据，通过匿名内部类进行操作，看源码，内部是循环,IntToDoubleFunction是一个匿名内部类，是一个接口 所以需要传入它的实现类
        Arrays.setAll(arr2, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return arr2[value]*0.8;
            }
        });
        /*
        //lambda表达式 对匿名内部类进行简写
        Arrays.setAll(arr2, (int value)-> {
                return arr2[value]*0.8;
        });*/
        System.out.println("全部重新设置后的arr2数组："+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("排序后的arr2数组："+Arrays.toString(arr2));
    }
}
