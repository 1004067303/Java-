package IO.PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        try(//字符流的打印流，想要追加模式，就需要先通过低级流来声明，然后传给高级流
            PrintWriter pout=new PrintWriter(new FileWriter("FileAndIO/src/IO/PrintStream/file.txt",true));
            //PrintWriter pout=new PrintWriter(new FileWriter("FileAndIO/src/IO/PrintStream/file.txt"));
        ) {
            pout.println(2);
            pout.println("ad");
            pout.println('a');
            pout.println('@');
            pout.write(97);
            pout.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
