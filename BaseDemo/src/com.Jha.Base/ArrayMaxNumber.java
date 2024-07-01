package com.Jha.Base;

import java.util.Random;

public class ArrayMaxNumber {
    public static void main(String[] args) {
        int[] nums={12,13,41,21,1,4};
        int max=nums[0];
        for (int i=1;i<=nums.length-1;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        System.out.println("最大值为："+max);

        for (int i = 0,j=nums.length-1; i < j; i++,j--) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        changeNumber(nums);
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void changeNumber(int[] nums)
    {
        for (int i=0;i<nums.length;i++)
        {
            Random r=new Random();
            int index= r.nextInt(nums.length) ;
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
        }
    }
}
