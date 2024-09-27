package ThreadDemo;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程2(Runnable)执行:"+(i+1));
        }
    }
}
