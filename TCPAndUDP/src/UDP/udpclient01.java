package UDP;

import java.io.IOException;
import java.net.*;

public class udpclient01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket client =new DatagramSocket(9898);//如果不指定，就动态分配
        byte[] msg="测试数据".getBytes();
        DatagramPacket data = new DatagramPacket(msg, msg.length, InetAddress.getLocalHost(),9999);
        client.send(data);
        System.out.println("发送完成！！！！！");
        client.close();
    }
}
