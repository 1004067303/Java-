package File;

import java.io.File;
import java.io.IOException;

public class FileCreatDemo {
    public static void main(String[] args) throws IOException {
        String createPath="FileAndIo/src/files/creat.txt";
        String DirPath="FileAndIo/src/files/test";//一级文件夹，就是一个文件夹一次创建
        String DirPaths="FileAndIo/src/files/test/bb/vv";//多级文件夹，多级创建文件夹，多个文件夹
        File file=new File(createPath);
        if(!file.exists()){
            System.out.println("创建文件："+file.createNewFile());
        }
        File file1=new File(DirPath);
        if(!file1.isDirectory()){
            System.out.println("创建一级文件夹："+file1.mkdirs());
        }
        File file2=new File(DirPaths);
        if(!file2.isDirectory()){
            System.out.println("创建多级文件夹："+file2.mkdirs());
        }
        System.out.println("删除文件："+file.delete());
        System.out.println("删除一级文件夹："+file1.delete());//无法删除，因为改文件夹里面有文件或文件夹，需要递归删除里面的内容
        System.out.println("删除多级文件夹"+file2.delete());//只会删掉一个文件夹
    }
}
