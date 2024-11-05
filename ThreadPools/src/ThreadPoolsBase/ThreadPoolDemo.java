package ThreadPoolsBase;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    /*
        int corePoolSize,  核心线程数
        int maximumPoolSize,    最大线程数
        long keepAliveTime,   额外线程存活时间
        TimeUnit unit,      时间单位
        BlockingQueue<Runnable> workQueue,   任务队列，等待执行的队列
        ThreadFactory threadFactory ,     线程工厂 一般直接使用默认的
        RejectedExecutionHandler handler  拒绝策略，当核心线程都在忙，达到最大线程数，且任务队列都满了，则进行拒绝策略
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        /* 对于不是无限等待
        //三个线程分别执行
        pool.execute(new myRunnable(10));//线程池会自动创建一个新线程，用来处理任务
        pool.execute(new myRunnable(20));//线程池会自动创建一个新线程，用来处理任务
        pool.execute(new myRunnable(30));//线程池会自动创建一个新线程，用来处理任务
        //达到三个核心线程数，会复用前面的线程，此时因为任务队列未满
        pool.execute(new myRunnable(40));
        pool.execute(new myRunnable(50));
        */
        /*
        //三个线程分别执行   无限等待
        pool.execute(new myRunnable2(10));//线程池会自动创建一个新线程，用来处理任务
        pool.execute(new myRunnable2(20));//线程池会自动创建一个新线程，用来处理任务
        pool.execute(new myRunnable2(30));//线程池会自动创建一个新线程，用来处理任务
        //达到三个核心线程数，会复用前面的线程，此时因为任务队列未满
        pool.execute(new myRunnable2(40));
        pool.execute(new myRunnable2(50));
        pool.execute(new myRunnable2(50));
        //任务队列堆满，开始新增临时线程
        pool.execute(new myRunnable2(60));
        pool.execute(new myRunnable2(70));
        //最大线程全部在忙，且队列满，走拒绝策略  java.util.concurrent.RejectedExecutionException
        pool.execute(new myRunnable2(70));

*/
        Future f1 = pool.submit(new myCallable(10));
        Future f2 = pool.submit(new myCallable(20));
        Future f3 = pool.submit(new myCallable(30));
        Future f4 = pool.submit(new myCallable(40));
        Future f5 = pool.submit(new myCallable(50));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(f5.get());

        //pool.shutdown();//线程池所有线程执行完毕之后关闭线程池
        pool.shutdownNow();//立即关闭线程池，无论是否执行完毕
    }
}

class myRunnable implements Runnable{
    int a;
    public myRunnable(int n){
        this.a=n;
    }
    @Override
    public void run() {
        int sum=0;
        for (int i = 1; i <= a; i++) {
            sum+=i;
        }
        System.out.println(Thread.currentThread().getName()+"对"+a+"求和得到："+sum);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class myRunnable2 implements Runnable{
    int a;
    public myRunnable2(int n){
        this.a=n;
    }
    @Override
    public void run() {
        int sum=0;
        for (int i = 1; i <= a; i++) {
            sum+=i;
        }
        System.out.println(Thread.currentThread().getName()+"对"+a+"求和得到："+sum);
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class myCallable implements Callable{
    int  n;
    public myCallable(int n){
        this.n=n;
    }
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Thread.currentThread().getName()+"对"+n+"求和得到："+sum;
    }
}
