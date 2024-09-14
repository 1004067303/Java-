package IO.PrintStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        try(//字节流的打印流，想要追加模式，就需要先通过低级流来声明，然后传给高级流
                PrintStream pout=new PrintStream(new FileOutputStream("FileAndIO/src/IO/PrintStream/file.txt",true));
                //PrintStream pout=new PrintStream(new FileOutputStream("FileAndIO/src/IO/PrintStream/file.txt"));
                ) {
            pout.println(2);
            pout.println("ad");
            pout.println('a');
            pout.println('@');
            pout.write(97);
            System.setOut(pout);//用来重定向println()方法
            System.out.println("芜湖起飞");
            pout.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
