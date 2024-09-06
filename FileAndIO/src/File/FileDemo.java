package File;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileDemo {
    public static void main(String[] args) {
        //System.out.println(System.getProperty("user.dir"));//获取当前程序的根目录：
        //String path="D:\\JAVA\\JavaDemo\\FileAndIO\\src\\files\\test.txt";//绝对路径，两个反斜杠表示
        //String path="D:/JAVA/JavaDemo/FileAndIO/src/files/test.txt";//绝对路径，一个正斜杠表示
        //String path="FileAndIO\\src\\files\\test.txt";//相对路径，一个正斜杠表示,默认到工程下去寻找文件
        String path="FileAndIO/src/files/test.txt";//相对路径，一个正斜杠表示，默认到工程下去寻找文件
        File file=new File(path);
        System.out.println("文件是否存在："+file.exists());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否是文件夹："+file.isDirectory());
        System.out.println("文件名："+file.getName());
        System.out.println("文件大小："+file.length()+"字节");
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        System.out.println("文件最后修改时间(时间戳)："+file.lastModified());
        System.out.println("文件最后修改时间："+formatter.format( LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault())));
        System.out.println("创建文件对象使用的路径："+file.getPath());
        System.out.println("文件的绝对路径"+file.getAbsolutePath());
    }
}
