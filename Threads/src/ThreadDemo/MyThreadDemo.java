package ThreadDemo;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread thread=new MyThread();
        thread.start();

       /* MyRunnable runnable=new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();*/
        new Thread(new MyRunnable()).start();
        //lambda表达式编写，因为可以创建匿名内部类
        new Thread(()-> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2(Runnable)Lambda执行:" + (i + 1));
                }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程1执行:"+(i+1));
        }

    }
}
