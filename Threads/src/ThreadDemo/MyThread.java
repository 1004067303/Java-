package ThreadDemo;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程1(Thread)执行:"+(i+1));
        }
    }
}
