package TCP.demoQunLiao;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class qlServer {
    //群聊转发服务
    public  static ArrayList<Socket> onlineSockets=new ArrayList<>();//用于存储在线的Socket客户端与服务器连接
    public static void main(String[] args) throws IOException {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,5,10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        ServerSocket serverSocket=new ServerSocket(9999);
        System.out.println("服务端启动！！！！！");
        while(true) {
                Socket socket = serverSocket.accept();
                onlineSockets.add(socket);//连接成功就添加进去
                //new Thread(new ReceiveMsg(socket)).start();
                pool.submit(new ReceiveMsg(socket));
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
                String msg = din.readUTF();
                System.out.println(socket.getRemoteSocketAddress()+"发送的数据为："+msg);
                sendMsgToALl(msg);
            }
        } catch (IOException e) {
            qlServer.onlineSockets.remove(socket);
            System.out.println(socket.getRemoteSocketAddress()+"离线了！！！");
        }
    }

    private void sendMsgToALl(String msg) throws IOException {
        for (Socket socket : qlServer.onlineSockets) {
            OutputStream out = socket.getOutputStream();
            DataOutputStream dout=new DataOutputStream(out);
            dout.writeUTF(msg);
            dout.flush();
        }
    }
}


