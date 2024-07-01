package com.Jha.Base;

import static com.Jha.Base.ValueSend.print;

public class ArrayCompare {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3=null;
        int[] arr4=null;
        int[] arr5 = {1, 2, 3, 4, 3, 6};
        int[] arr6 = {1, 2, 3, 4, 3, 6, 1};
        int[] copy=new int[100];
        System.arraycopy(arr1,0,copy,0,arr1.length);
        System.out.println("==================");
        print(copy);
        System.out.println("==================");
        System.out.println(CompareArray(arr1, arr2));
        System.out.println();
        System.out.println(CompareArray(arr3, arr4));
        System.out.println();
        System.out.println(CompareArray(arr1, arr4));
        System.out.println();
        System.out.println(CompareArray(arr1, arr5));
        System.out.println();
        System.out.println(CompareArray(arr6, arr5));
    }

    public static boolean CompareArray(int[] arr1, int[] arr2) {

        if (arr1 == null & arr2 == null) {
            System.out.println("两数组相等且为null");
            return true;
        }

        if (arr1 == null || arr2 == null) {
            System.out.println("两数组不相等且有其一为null");
            return false;
        }


        if (arr1.length != arr2.length) {
            System.out.println("两数组长度不等");
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("两个数组值不相等");
                return false;
            }
        }
        return true;
    }
}
