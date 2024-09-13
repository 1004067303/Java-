package Exceptions;

public class MySource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("关闭了我自己的资源");
    }
}
