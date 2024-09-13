package IO;

import java.io.*;

/**
 * 用于测试缓冲流和原始流的性能的比较，自己找一个比较大的文件来复制比较
 */

public class BufferedCopyDemo {
    public static void main(String[] args) {
        //Copy1("D:/meeting_01.mp4","D:/会议/copy1.mp4");
        Copy2("D:/meeting_01.mp4","D:/会议/copy2.mp4");
        Copy3("D:/meeting_01.mp4","D:/会议/copy3.mp4");
        Copy4("D:/meeting_01.mp4","D:/会议/copy4.mp4");
    }

    /**
     * 原始流复制文件，一个字节一个字节的复制,要等待非常久，不建议
     * @param SourcePath
     * @param ToPath
     * @return
     */
    public static boolean Copy1(String SourcePath, String ToPath) {
        long startTime=System.currentTimeMillis();
        Boolean flag = false;
        try (InputStream in = new FileInputStream(SourcePath);
             OutputStream out = new FileOutputStream(ToPath);) {
            int len = 0;
            while ((len =in.read()) != -1) {
                out.write(len);
            }
            flag = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("原始流复制文件，一个字节一个字节的复制耗时:"+(endTime - startTime) +"ms");
        return flag;
    }

    /**
     * 原始流一次读取1K
     * @param SourcePath
     * @param ToPath
     * @return
     */
    public static boolean Copy2(String SourcePath, String ToPath) {
        long startTime=System.currentTimeMillis();
        Boolean flag = false;
        try (InputStream in = new FileInputStream(SourcePath);
             OutputStream out = new FileOutputStream(ToPath);) {
            int len = 0;
            byte[] buffer=new byte[1024];
            while ((len =in.read(buffer)) > 0) {
                out.write(buffer,0,len);
            }
            flag = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("原始流复制文件，一次读取1K的复制耗时:"+(endTime - startTime) +"ms");
        return flag;
    }

    /**
     * 缓冲流一次读取一个字节
     * @param SourcePath
     * @param ToPath
     * @return
     */
    public static boolean Copy3(String SourcePath, String ToPath) {
        long startTime=System.currentTimeMillis();
        Boolean flag = false;
        try (InputStream in = new FileInputStream(SourcePath);
             OutputStream out = new FileOutputStream(ToPath);
             BufferedInputStream bin=new BufferedInputStream(in);
            /* BufferedInputStream bin=new BufferedInputStream(in,1024*8);
             BufferedOutputStream bout=new BufferedOutputStream(out,1024*8)*///可以自定义缓冲区大小，大一点好，但是太大了也没用，存在性能上限，一般32K就很大了
             BufferedOutputStream bout=new BufferedOutputStream(out)
             ) {
            int len = 0;
            while ((len =bin.read()) != -1) {
                bout.write(len);
            }
            flag = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("缓冲流一次读取一个字节的复制耗时:"+(endTime - startTime) +"ms");
        return flag;
    }

    /**
     * 缓冲流一次读取1K
     * @param SourcePath
     * @param ToPath
     * @return
     */
    public static boolean Copy4(String SourcePath, String ToPath) {
        long startTime=System.currentTimeMillis();
        Boolean flag = false;
        try (InputStream in = new FileInputStream(SourcePath);
             OutputStream out = new FileOutputStream(ToPath);
             BufferedInputStream bin=new BufferedInputStream(in);
             BufferedOutputStream bout=new BufferedOutputStream(out)) {
            int len = 0;
            byte[] buffer=new byte[1024];
            while ((len =bin.read(buffer)) > 0) {
                bout.write(buffer,0,len);
            }
            flag = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("原始流复制文件，一次读取1K的复制耗时:"+(endTime - startTime) +"ms");
        return flag;
    }
}
