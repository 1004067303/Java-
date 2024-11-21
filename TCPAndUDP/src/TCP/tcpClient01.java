package TCP;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class tcpClient01 {
    public static void main(String[] args) {
        System.out.println("客户端启动！！！！！");
        try(Socket client = new Socket("localhost", 9999);
            OutputStream out=client.getOutputStream();
            DataOutputStream dout=new DataOutputStream(out)
        ){

            dout.writeUTF("芜湖，起飞");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
