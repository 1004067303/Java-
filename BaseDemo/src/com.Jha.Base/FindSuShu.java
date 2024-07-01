package com.Jha.Base;

public class FindSuShu {
    public static void main(String[] args) {
        //找素数，仅仅能够被1和他本身整除的数 1不是 101-200
        CountSuShu(1,100);

    }

    public static void CountSuShu(int start,int end)
    {
        int num=0;
        int count=0;
        for (int i=start;i<=end;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("总共"+count+"个素数");
    }

    public static boolean isPrime(int n)
    {
        if(n<=0)
        {
            return false;
        }
        if(n==2||n%2==0)
        {
            return false;
        }
        for(int i=3;i<=n/2;i+=2)
        {
            if(n%i==0)
            {

                return false;
            }
        }
        return true;
    }
}
