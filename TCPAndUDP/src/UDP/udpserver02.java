package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpserver02 {
    public static void main(String[] args) throws Exception {
        DatagramSocket server=new DatagramSocket(10000);
        byte[] bytes=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
        while(true){
            server.receive(packet);
            System.out.println("接收到来自"+packet.getAddress().getHostAddress()+":"+
                    packet.getPort()+"的数据："+new String(bytes, 0, packet.getLength()));
        }
    }
}
