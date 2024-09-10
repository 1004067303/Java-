package IO.ByteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream input=new FileInputStream("FileAndIO/src/IO/ByteStream/file.txt");
        System.out.println((char) input.read());//读取中文会出现乱码，无法避免 且每次读取一个字节，性能较差
        int b;
        while ((b=input.read())!=-1){//注意，上面已经用流读了一个字节了
            System.out.print((char) b);
        }
        input.close();//流使用完之后必须要关闭回收，释放内存
        System.out.println("===============================================================");
        InputStream input2=new FileInputStream("FileAndIO/src/IO/ByteStream/file.txt");
        int len=0;
        byte[] buffer=new byte[3];//每次读3个字节，正常开发应该要1024以上
        while ((len=input2.read(buffer))!=-1){//也不能解决中文乱码问题
            //System.out.print(new String(buffer));
            System.out.print(new String(buffer,0,len));//实例化读到的长度 避免倒出错误的值
        }
        input2.close();
        System.out.println("==============================================================");
        InputStream input3=new FileInputStream("FileAndIO/src/IO/ByteStream/file.txt");
        //不使用接口，自己实现全部读取
        {
            /*File file = new File("FileAndIO/src/IO/ByteStream/file.txt");
            byte[] by = new byte[(int) file.length()];
            input3.read(by);
            System.out.println(new String(by));*/
        }
        byte[] bytes = input3.readAllBytes();//FileInputStream自带API
        System.out.println(new String(bytes));
        input3.close();
    }
}
