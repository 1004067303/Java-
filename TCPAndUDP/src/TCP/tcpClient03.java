package TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class tcpClient03 {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",9999);
        System.out.println("客户端启动！！！！");
        OutputStream out = client.getOutputStream();
        DataOutputStream dout=new DataOutputStream(out);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("请输入：");
            String msg = sc.nextLine();
            if(msg.equals("exit")){
                sc.close();
                dout.close();
                out.close();
                client.close();
                break;
            }
            dout.writeUTF(msg);
        }
    }
}
