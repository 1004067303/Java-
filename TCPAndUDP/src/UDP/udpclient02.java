package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpclient02 {
    public static void main(String[] args) throws Exception {
        DatagramSocket client=new DatagramSocket();
        Scanner sc=new Scanner(System.in);

        while(true){
            String msg=sc.nextLine();
            if(msg.equals("exit")){
                break;
            }
            byte[] bytes = msg.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),10000);
            client.send(packet);
            System.out.println("发送消息成功!!!!");
        }
        client.close();
    }
}
