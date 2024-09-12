package IO.BufferedByteStream;

import java.io.*;

public class BufferedByteStreamDemo {
    public static void main(String[] args) throws IOException {
        String SourcePath = "FileAndIO/src/IO/ByteStream/out.txt";
        String ToPath = "FileAndIO/src/IO/ByteStream/out11.txt";
        System.out.println("复制状态：" + Copy(SourcePath, ToPath));
    }
    public static boolean Copy(String SourcePath, String ToPath) {
        Boolean flag = false;

        try (InputStream in = new FileInputStream(SourcePath);
             InputStream bin=new BufferedInputStream(in);
             OutputStream out = new FileOutputStream(ToPath);
             OutputStream bout=new BufferedOutputStream(out)) {
            byte[] buffer = new byte[1024 * 8];
            int len = 0;
            while ((len = bin.read(buffer)) > 0) {
                bout.write(buffer, 0, len);
            }
            flag = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
