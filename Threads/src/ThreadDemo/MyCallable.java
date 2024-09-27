package ThreadDemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    public  int n;
    public MyCallable(int n){
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        //获取1-n的值
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return "1-"+n+"的和为："+sum;
    }
}
