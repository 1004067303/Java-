package System;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        long begMs = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1);
            System.out.print(i+" ");
        }
        long endMs = System.currentTimeMillis();
        System.out.println();
        System.out.println("花费了"+(endMs - begMs) / 1000.0+" 秒");
        System.out.println("花费了"+(endMs - begMs ) +" 毫秒");
        System.exit(-1);
    }
}
