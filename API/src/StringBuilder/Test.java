package StringBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {




        static class WorkerThread implements Runnable {
            private final StringBuffer sharedSB;

            public WorkerThread(StringBuffer sharedSB) {
                this.sharedSB = sharedSB;
            }

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    sharedSB.append("thread" + Thread.currentThread().getId());
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            StringBuffer sb = new StringBuffer();
            ExecutorService executor = Executors.newFixedThreadPool(2);

            for (int i = 0; i < 2; i++) {
                executor.execute(new WorkerThread(sb));
            }

            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.MINUTES);

            System.out.println(sb.toString()); // 输出结果可能出现乱序或丢失部分字符串
        }


}
