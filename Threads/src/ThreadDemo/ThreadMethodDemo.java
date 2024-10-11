package ThreadDemo;

public class ThreadMethodDemo {
    public static void main(String[] args) throws Exception {
        //Thread t1=new MyThread2();
        Thread t1=new MyThread2("线程1");
        System.out.println(t1.getName());
        t1.start();
        t1.join();


        //Thread t2=new MyThread2();
        Thread t2=new MyThread2("线程2");
        System.out.println(t2.getName());
        t2.start();
        t2.join();


        //Thread t3=new MyThread2();
        Thread t3=new MyThread2("线程3");
        System.out.println(t3.getName());
        t3.start();
        t3.join();


        System.out.println("当前线程为："+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"线程(Thread)执行:"+(i+1));
        }
    }
}
