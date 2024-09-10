package IO.ByteStream;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String SourcePath="FileAndIO/src/IO/ByteStream/out.txt";
        String ToPath="FileAndIO/src/IO/ByteStream/out11.txt";
        System.out.println("复制状态："+Copy(SourcePath, ToPath));
    }
    /**
     * 复制文件，适用于一切文件，但是目标文件夹必须存在
     * @param SourcePath
     * @param ToPath
     * @return
     */
    public static boolean Copy(String SourcePath,String ToPath){
        Boolean flag=false;
        InputStream in=null;
        OutputStream out=null;
        try {
             in=new FileInputStream(SourcePath);
             out=new FileOutputStream(ToPath);
            byte[] buffer=new byte[1024*8];
            int len=0;
            while((len=in.read(buffer))>0){
                out.write(buffer,0,len);
            }
            flag=true;

        } catch (IOException e) {
            System.out.println("打开字节流异常");
        }
        finally {
            try {
                if(in!=null)
                in.close();
                if(out!=null)
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return flag;
    }
}
