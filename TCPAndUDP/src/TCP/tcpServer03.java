package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class tcpServer03 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(9999);
/*
public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)
 */
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,5,10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


        System.out.println("服务端启动！！！！！");
        while(true){
            System.out.println("等待连接中~~~~~~");
            Socket socket = serverSocket.accept();
            new Thread(new ReceiveMsg(socket)).start();//采用每次新建一个线程
            //pool.submit(new ReceiveMsg(socket));

        }
    }
}

class ReceiveMsg implements Runnable{
    public  Socket socket;
 public ReceiveMsg(Socket socket){
     this.socket=socket;
 }
 public ReceiveMsg(){

 }
    @Override
    public void run() {
        System.out.println(socket.getRemoteSocketAddress()+"连接成功！！！！");
        try {
            InputStream in = socket.getInputStream();
            DataInputStream din=new DataInputStream(in);
            while (true){
                System.out.println(socket.getRemoteSocketAddress()+"发送的数据为："+din.readUTF());
            }
        } catch (IOException e) {
            System.out.println(socket.getRemoteSocketAddress()+"离线了！！！");
        }
    }
}
