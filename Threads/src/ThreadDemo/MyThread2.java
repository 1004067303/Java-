package ThreadDemo;

public class MyThread2 extends Thread {
    public MyThread2(String name){
        super(name);
    }
    public MyThread2(){

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"线程(Thread)执行:"+(i+1));
        }
    }
}
