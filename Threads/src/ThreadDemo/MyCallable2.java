package ThreadDemo;

import java.util.concurrent.Callable;

public class MyCallable2 implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程1(Callable)执行:"+(i+1));
        }
        return null;
    }
}
