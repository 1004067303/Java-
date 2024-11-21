package TCP;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpServer01 {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(9999);
            Socket accept = serverSocket.accept();
            InputStream in = accept.getInputStream();
            DataInputStream din=new DataInputStream(in)
        )
        {
            System.out.println("服务端启动！！！");
            System.out.println("读取到了："+din.readUTF());

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
