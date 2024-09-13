package IO.BufferedStringStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        Writer write = new FileWriter("FileAndIO/src/IO/ByteStream/fileWrite.txt", true);//追加模式
        BufferedWriter bw=new BufferedWriter(write);
        bw.write(97);
        bw.write("97");
        bw.write(new char[]{'1', '中', '文'});
        bw.write(new char[]{'1', '中', '文'}, 1, 2);
        bw.newLine();
        bw.flush();
    }
}
