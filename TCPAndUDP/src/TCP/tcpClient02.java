package TCP;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class tcpClient02 {
    public static void main(String[] args) {
        System.out.println("客户端启动！！！！！");
        try(
                Socket client=new Socket("localhost",9999);
                OutputStream out = client.getOutputStream();
                DataOutputStream dout=new DataOutputStream(out);
                Scanner sc=new Scanner(System.in);
                ){
            while(true){
                System.out.print("准备传入：");
                String msg = sc.nextLine();
                if(msg.equals("exit")){
                    System.out.println("客户端程序退出！！！！");
                    break;
                }
                dout.writeUTF(msg);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
