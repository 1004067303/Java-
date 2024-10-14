package ThreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account{
    String account;
    Double money;
    private Lock lk=new ReentrantLock();
    public Account() {
    }

    public Account(String account, Double money) {
        this.account = account;
        this.money = money;
    }

    public void subMoney(){
        //对于实例方法，一般使用this来作为锁对象  同步代码块
        synchronized (this) {
            if(money>=10000) {
                System.out.println(Thread.currentThread().getName() + "取了一万");
                money = money - 10000;
                System.out.println(Thread.currentThread().getName() + "取钱后剩余：" + money);
            }else {
                System.out.println(Thread.currentThread().getName()+"取钱时余额不足");
            }
        }
    }
    //同步方法
    public synchronized void subMoney2(){
            if(money>=10000) {
                System.out.println(Thread.currentThread().getName() + "取了一万");
                money = money - 10000;
                System.out.println(Thread.currentThread().getName() + "取钱后剩余：" + money);
            }else {
                System.out.println(Thread.currentThread().getName()+"取钱时余额不足");
            }

    }

    //同步锁 可以在任意的地方进行加锁，更加的方便，但是需要释放资源 使用try-finally
    public  void subMoney3(){
        try{
            lk.lock();
        if(money>=10000) {
            System.out.println(Thread.currentThread().getName() + "取了一万");
            money = money - 10000;
            System.out.println(Thread.currentThread().getName() + "取钱后剩余：" + money);
        }else {
            System.out.println(Thread.currentThread().getName()+"取钱时余额不足");
        }}
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            lk.unlock();
        }

    }
    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", money=" + money +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;

    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
