package RunTime;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("可用的处理器数："+runtime.availableProcessors());
        System.out.println("内存总量："+runtime.totalMemory()/1024.0/1024.0 +"MB");
        System.out.println("可用的内存总量："+runtime.freeMemory()/1024.0/1024.0 +"MB");
        Process exec = runtime.exec("D:\\QQ\\QQ.exe");
        System.out.println(0.1 + 0.2);
        Thread.sleep(5000);
        exec.destroy();
    }
}
