package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpserver01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket server=new DatagramSocket(9999);
        byte[] msg=new byte[1024*64];
        DatagramPacket data= new DatagramPacket(msg,1024);
        server.receive(data);
        int length = data.getLength();
        System.out.println("接受到的数据为："+new String(msg,0,length));
        System.out.println("数据接收完成！！");
        System.out.println(data.getAddress());//获取的是客户端InetAddress对象
        System.out.println(data.getAddress().getHostAddress());//获取的是String字符串，即获取的客户端ip地址
        System.out.println(data.getPort());//获取客户端的端口号
        server.close();
    }
}
