package IO.ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //OutputStream out=new FileOutputStream("FileAndIO/src/IO/ByteStream/out.txt");
        OutputStream out=new FileOutputStream("FileAndIO/src/IO/ByteStream/out.txt",true);//追加模式
        out.write(97);
        out.write('b');
        //out.write('中');//会乱码，因为中文是三个字节，而这个只是一个字节
        byte[] buffer = "我爱中国asdw1".getBytes();
        out.write(buffer);
        out.write(buffer,0,13);
        out.write("\r\n".getBytes());//使用\r\n是为了兼容多个平台
        out.close();
    }
}
