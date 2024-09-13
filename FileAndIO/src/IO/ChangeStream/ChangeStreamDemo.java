package IO.ChangeStream;

import java.io.*;

public class ChangeStreamDemo {
    public static void main(String[] args) {
        StringStream();
        System.out.println("==================");
        ChangStream();
        Copy("FileAndIO/src/IO/ChangeStream/file.txt","FileAndIO/src/IO/ChangeStream/copy.txt");//复制出来是存在乱码的
        CopyGBK("FileAndIO/src/IO/ChangeStream/file.txt","FileAndIO/src/IO/ChangeStream/copy2.txt");//
    }

    /**
     * 读取GBK编码的文件，由于本身默认是UTF-8，所以读取出来是乱码
     */
    public static void StringStream(){
        try (Reader r=new FileReader("FileAndIO/src/IO/ChangeStream/file.txt");
             BufferedReader br=new BufferedReader(r)
        ){
            String line;
            while ((line= br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void ChangStream(){
        try (InputStream r=new FileInputStream("FileAndIO/src/IO/ChangeStream/file.txt");
             InputStreamReader in=new InputStreamReader(r,"GBK");//通过原始字节流转换为对于编码的字符流
             BufferedReader br=new BufferedReader(in)
        ){
            String line;
            while ((line= br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean Copy(String SourcePath, String ToPath) {
        Boolean flag = false;

        try (InputStream in = new FileInputStream(SourcePath);
             OutputStream out = new FileOutputStream(ToPath);) {
            byte[] buffer = new byte[1024 * 8];
            int len = 0;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            flag = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
    public static boolean CopyGBK(String SourcePath, String ToPath) {
        Boolean flag = false;

        try (InputStream in = new FileInputStream(SourcePath);
             Reader sin=new InputStreamReader(in,"GBK");
             BufferedReader bin=new BufferedReader(sin);
             //OutputStream out = new FileOutputStream(ToPath,true);//如果需要追加模式，就在最前面的字节流处添加说明即可
             OutputStream out = new FileOutputStream(ToPath);
             //Writer sout=new OutputStreamWriter(out,"GBK");//如果想要指定写某种编码，就添加说明
             Writer sout=new OutputStreamWriter(out);
             BufferedWriter bout=new BufferedWriter(sout)
             ) {
            String line;
            while ((line = bin.readLine()) != null) {
                bout.write(line);
                bout.newLine();
            }
            flag = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
