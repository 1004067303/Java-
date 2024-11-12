package ThreadPoolsBase;

import java.util.concurrent.atomic.AtomicInteger;

public class happyLockDemo {
    public static void main(String[] args) {
        /*
        对于乐观锁和悲观锁
        悲观锁，就是前面所使用的直接加锁，对于可能出现问题的代码，直接加锁，
        乐观锁，通过CAS算法来解决线程安全问题，简单理解就是 拿到这个元素的时候，存储一份这个元素，做完修改操作之后，
        用存储的和目前这个元素的值来对比，如果相同，那么就说明没有发生线程安全问题，可以更新，反之，放弃这次更新，
        重新再做一次上述操作
        对一个数 进行累加，100个线程，每个线程加一百次，每次加1
         */
        Runnable r=new myThread2();
        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }
    }
}
class myThread2 implements Runnable{
    int num;
    AtomicInteger nums=new AtomicInteger();
    @Override
    public void run(){
        //synchronized (this)
        {
        for (int i = 0; i < 100; i++) {
           // System.out.println(Thread.currentThread().getName() +"得到："+ ++num);
            System.out.println(Thread.currentThread().getName() +"得到："+ nums.incrementAndGet());//乐观锁
        }
        }
    }
}
