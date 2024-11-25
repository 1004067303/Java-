package TCP.WebSocketDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class WebSocketService {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(9999);
        /*
        int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler
         */
        ThreadPoolExecutor pool=new ThreadPoolExecutor(16*2,
                32,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        while (true){
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+" 上线了！！！");
            //new Thread(new webOut(socket)).start();
            pool.submit(new webOut(socket));


        }


    }
}
class webOut implements Runnable {
public  Socket socket;
    public webOut(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        OutputStream out = null;
        PrintStream pout=null;
        try {
            String  msg="js ";
            out = socket.getOutputStream();
            pout=new PrintStream(out);
            pout.println("HTTP/1.1 200 OK");
            pout.println("Content-type:text/html;charset=UTF-8");
            pout.println();
            pout.println("<div>芜湖起飞！！<div>");
            pout.flush();
            out.close();
            pout.close();
            socket.close();

        } catch (IOException e) {
            System.out.println(e);
            try {
                out.close();
                pout.close();
                socket.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }
}
