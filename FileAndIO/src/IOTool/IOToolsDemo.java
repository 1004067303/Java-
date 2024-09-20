package IOTool;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class IOToolsDemo {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("FileAndIO/src/files/测试文件夹/测试.txt"), new File("FileAndIO/src/IOTool/file.txt"));
    }
}
