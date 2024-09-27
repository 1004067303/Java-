package ThreadDemo;

import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) {
        //创建Callable对象
        MyCallable call=new MyCallable(100);
        //将Callable对象封装为FutureTask对象，并确定返回的类型
        //FutureTask的作用
        //是一个任务对象，实现类Runnable接口，因此可以通过Thread类实例化
        //可以在线程执行完毕之后，调用get方法获取执行完毕之后返回的值
        FutureTask<String> task=new FutureTask<>(call);
        //将FutureTask封装为Thread类并执行
        new Thread(task).start();

        try {
            //注意，此处需要对异常进行处理，或者抛异常，调用get时，主线程会进入阻塞，等到子线程执行完毕才会继续执行，以次来保证子线程执行完毕
            System.out.println(task.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MyCallable2 call2=new MyCallable2();
        FutureTask<String> task2=new FutureTask<>(call2);
        new Thread(task2).start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程1执行:"+(i+1));
        }
    }
}
