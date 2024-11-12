package ThreadPoolsBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        例子，有一百份礼物，由两个人同时发送，发送到只剩下10份的时候，停止发送，并且统计二者发送的数量
         */
        String[] names={"钱包","手机","玩具","手表","电脑","鞋子"};
        List<String> gift=new ArrayList<>() ;
        Random r=new Random();
        for (int i = 1; i <=100 ; i++) {
            gift.add(names[r.nextInt(names.length)]+i);
        }
        System.out.println(gift.toString());
        myThread xh = new myThread("小红", gift);
        xh.start();
        myThread xm = new myThread("小明", gift);
        xm.start();
        xh.join();
        xm.join();
        System.out.println("小红总共发送了："+xh.count);
        System.out.println("小明总共发送了："+xm.count);
    }
}

class myThread extends Thread {
    List<String> gift;
    Random r=new Random();
    int count;//用于记录每个线程执行了多少次
    public myThread(String name,List<String> gifts){
        super(name);
        this.gift=gifts;
    }
    @Override
    public void run()  {
        while(true) {
            synchronized (gift) {
            if (gift.size() <= 10) {
                break;
            }

                String remove = gift.remove(r.nextInt(gift.size()));
            System.out.println(Thread.currentThread().getName() + "发送了" + remove);
            count++;
            }
        }
    }
}
