package ThreadSafe;

public class ThreadSafeDemo {
    public static void main(String[] args) {
        Account t1=new Account("芜湖",10000.0);
        System.out.println(t1);
        Thread t2=new SafeThread(t1,"芜湖");
        Thread t3=new SafeThread(t1,"起飞");
        t2.start();
        t3.start();
    }
}
