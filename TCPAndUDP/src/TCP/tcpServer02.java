package TCP;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpServer02 {
    public static void main(String[] args) {
        try (
                ServerSocket serverSocket= new ServerSocket(9999);
                Socket server = serverSocket.accept();//等待和客户端连接
                InputStream in = server.getInputStream();//获取输入流
                DataInputStream din=new DataInputStream(in);//包装输入流
                )
        {
            while(true) {
                System.out.println("从" + server.getRemoteSocketAddress() + "接收到的数据：" + din.readUTF());
            }

        }catch (Exception e)
        {
            System.out.println("客户端断开！！！！");
        }
    }
}
