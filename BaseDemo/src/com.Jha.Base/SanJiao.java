package com.Jha.Base;

public class SanJiao {
    public static void main(String[] args) {

        SanJiaoPrint(10);
    }
    public static void SanJiaoPrint(int n)
    {
        for(int i=1;i<=n;i++)
        {

            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int m=1;m<=2*i-1;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
