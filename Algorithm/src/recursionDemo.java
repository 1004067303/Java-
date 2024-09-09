public class recursionDemo {
    public static void main(String[] args) throws Exception {
        System.out.println(fun1(5));
        System.out.println(fun2(100));
        System.out.println(fun3(9));
    }
    //计算n的阶乘 即6的阶乘为 6*5*4*3*2*1
    public static int fun1(int n) throws Exception {
        if(n>0) {
            if (n == 1) {
                return n;
            } else
                return n * fun1(n - 1);
        }else {
            throw  new Exception("输入参数不正确");
        }
    }
    //求1-n的和 即 1-5的和为：1+2+3+4+5
    public static int fun2(int n) throws Exception {
        if(n>0) {
            if (n == 1) {
                return 1;
            } else
                return n + fun2(n - 1);
        }else
            throw new Exception("输入参数不正确");
    }
    /*
    s10---1   s9/2-1=1--->S9=4
    s9   4    s8/2-1=4--->S8=10  以此类推
    s8   10   Sn/2-1=Sn+1  变式等于Sn=2Sn+1 +2   Sn+1 是n+1
    s7
    s6
    s5
    s4
    s3
    s2 (n/2-1)/2 -1
    s1 n/2 -1
    n
    */
    //猴吃桃问题解决
    static int fun3(int  n){
        if(n==10){
            return 1;
        }
        else {
            return 2*fun3(n+1)+2;
        }
    }
}
