package IO.StringStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        //Writer write=new FileWriter("FileAndIO/src/IO/ByteStream/fileWrite.txt");
        Writer write = new FileWriter("FileAndIO/src/IO/ByteStream/fileWrite.txt", true);//追加模式
        write.write(97);
        write.write("97");
        write.write(new char[]{'1', '中', '文'});
        write.write(new char[]{'1', '中', '文'}, 1, 2);
        write.write("\r\n");
        write.flush();//调用之后文件才会有数据，不然数据还在缓冲区
        write.close();//调用之后也会有数据，因为关闭之前会自动调用flush方法
    }
}
