package IOTool;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class IOToolsDemo {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("FileAndIO/src/files/测试文件夹/测试.txt"),
                new File("FileAndIO/src/IOTool/file.txt"));
        FileUtils.copyDirectory(new File("FileAndIO/src/files/测试文件夹"),
                new File("FileAndIO/src/files/复制文件夹"));
        FileUtils.deleteDirectory(new File("FileAndIO/src/files/复制文件夹"));
        System.out.println(FileUtils.readFileToString(new File("FileAndIO/src/files/测试文件夹/测试.txt")));
        FileUtils.writeStringToFile(new File("FileAndIO/src/files/测试文件夹/写入.txt"),"写入数据，\n测试", Charset.forName("GBK"),true);
        //官方提供的api接口Files。如果文件存在，则会报错
        Files.copy(Path.of("FileAndIO/src/files/测试文件夹/测试.txt"),Path.of("FileAndIO/src/files/测试文件夹/测试33.txt"));
    }
}
