package ThreadCommunicate;

import java.util.ArrayList;
import java.util.List;

public class ThreadCommunicateDemo {
    public static void main(String[] args) {
        /*
        生产者线程： 生成消息给到待消费队列
        消费者线程： 在待消费队列消费消息
        代消费队列： 用于作为生产者和消费者之间中转，两种线程来进行竞争，作为锁对象
         */
        transit tran=new transit();
        new Thread (()->{
            while(true) {
                tran.create();
            }
        },"生产者1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    tran.create();
                }
            }
        },"生产者2").start();
        new Thread (()->{
            while(true) {
                tran.create();
            }
        },"生产者3").start();
        new Thread (()->{
            while(true) {
                tran.use();
            }
        },"消费者1").start();
        new Thread (()->{
            while(true) {
                tran.use();
            }
        },"消费者2").start();
    }
    static class transit{
        List<String> msg=new ArrayList<>();
        public transit(){

        }
        synchronized void create(){
            try {
                if(msg.size()==0){
                    msg.add(Thread.currentThread().getName() +"生产的产品");
                    System.out.println(Thread.currentThread().getName()+"生产了产品");
                    Thread.sleep(2000);
                }
                //无论是否有产品生产 都需要唤醒其他线程，然后自己陷入等待
                this.notifyAll();
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        synchronized void use(){
            try {
                if(msg.size()>0){
                    //消费完消息，把中转站清空
                    System.out.println(Thread.currentThread().getName()+"消费了"+msg.get(0));
                    msg.clear();
                }
                //无论是否有产品可以消费 都需要唤醒其他线程，然后自己陷入等待
                this.notifyAll();
                this.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
