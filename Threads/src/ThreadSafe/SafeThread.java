package ThreadSafe;

public class SafeThread extends Thread{
    Account a;
    public SafeThread(Account a, String name ) {
        super(name);
        this.a = a;
    }
    @Override
    public void run() {
        /*
        a.subMoney();
        a.subMoney2();
        */
        a.subMoney3();
    }
}
