package TCP.WebSocketDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebSocketService {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(9999);
        Socket socket = serverSocket.accept();



    }
}
class webOut implements Runnable {
public  Socket socket;
    public webOut(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        OutputStream out = null;
        PrintStream pout=null;
        try {
            String  msg="js ";
            out = socket.getOutputStream();
            pout=new PrintStream(out);
            //pout.print();未完成
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
