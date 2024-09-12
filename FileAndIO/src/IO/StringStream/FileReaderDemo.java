package IO.StringStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(Reader reader=new FileReader("FileAndIO/src/IO/ByteStream/file.txt");) {
            //每次读取一个字符,这样子性能会很差，有多少个字符就要调用多少次
            /*int num=0;
            while ((num= reader.read())>0){
                System.out.print((char) num);
            }*/
            //一次读取多个字符
            int len;
            char[] buffer=new char[1024*8];
            while ((len= reader.read(buffer))>0){
                //System.out.println(new String(buffer));//这么输出会有很多null值
                System.out.println(new String(buffer,0,len));//读取到了多少就输出多少，这样能保证不会多出空值或者其他值
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
