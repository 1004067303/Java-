package ThreadSafe;

public class Account{
    String account;
    Double money;

    public Account() {
    }

    public Account(String account, Double money) {
        this.account = account;
        this.money = money;
    }

    public void subMoney(){
        //对于实例方法，一般使用this来作为锁对象
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

    public synchronized void subMoney2(){
        //对于实例方法，一般使用this来作为锁对象

            if(money>=10000) {
                System.out.println(Thread.currentThread().getName() + "取了一万");
                money = money - 10000;
                System.out.println(Thread.currentThread().getName() + "取钱后剩余：" + money);
            }else {
                System.out.println(Thread.currentThread().getName()+"取钱时余额不足");
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
