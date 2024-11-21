package TCP.demoQunLiao;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class qlClient {
    //群聊客户端需要能发能收
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",9999);
        System.out.println("客户端启动！！！！！");
        new Thread(new ClintReceive(client)).start();//启动接收线程
        OutputStream out = client.getOutputStream();
        DataOutputStream dout=new DataOutputStream(out);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("请输入：");
            String msg = sc.nextLine();
            if(msg.equals("exit")){
                System.out.println( "当前客户端下线！！！");
                sc.close();
                dout.close();
                out.close();
                client.close();
                break;
            }
            dout.writeUTF(msg);
            dout.flush();
        }
    }
}
class ClintReceive implements Runnable {
public Socket socket;
public ClintReceive(Socket socket){
    this.socket=socket;
}
    @Override
    public void run() {
    try {
        System.out.println(socket.getLocalSocketAddress() +"接收服务启动！！！");
        InputStream in = socket.getInputStream();
        DataInputStream din = new DataInputStream(in);
        while (true) {
            String msg = din.readUTF();
            System.out.println(socket.getRemoteSocketAddress() + "发来的：" + msg);
        }
    }catch (Exception e)
    {
        System.out.println(socket.getRemoteSocketAddress() + "下线");
    }
    }
}
