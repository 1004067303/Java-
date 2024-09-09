package File;

import java.io.File;

public class FileIterator {
    public static void main(String[] args) {
        File file=new File("FileAndIO/src/files/测试文件夹");
        String[] list = file.list();
        File[] files = file.listFiles();
        for (File file1 : files) {
            String name = file1.getName();
            if(name.equals("芜湖.txt")){
                file1.renameTo(new File("FileAndIO/src/files/测试文件夹","起飞.txt"));
            }
            System.out.println(name);
        }
        deleteDic(new File("D:\\JAVA\\JavaDemo\\FileAndIO\\src\\files\\测试文件夹\\新建文件夹"));
        getPath(new File("D:/"), "QQ.exe");

    }
    public static void getPath(File file,String fileName){

        if(!file.exists()||file.isFile()||file==null)
        {
            return ;
        }
        File[] fileList = file.listFiles();
        if(fileList!=null && fileList.length>0) {
            for (File f : fileList) {
                if (f.isFile()) {
                    if (f.getName().equals(fileName))
                    {
                        System.out.println(f.getAbsolutePath());
                        return;
                    }
                }
                else {
                    getPath(f,fileName);
                }
            }
        }

    }

    public static boolean deleteDic(File dic){

        if(!dic.exists()||dic==null){
            return false;
        }
        if(dic.isDirectory()&&dic.list().length>0)//是文件夹且里面有文件
        {
            for (File file : dic.listFiles()) {
                if (file.isDirectory()&&file.list().length>0){
                    deleteDic(file);
                }
                return file.delete();
            }
        }else {
            return  dic.delete();
        }
        return dic.delete();
    }
}
