package UTF;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class UTF8Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg="1a中@";
        byte[] bytes = msg.getBytes();
        byte[] bytes2 = msg.getBytes("GBK");//需要处理异常
        System.out.println("系统默认字符集编码："+Arrays.toString(bytes));
        System.out.println("GBK字符集编码："+Arrays.toString(bytes2));

        System.out.println("系统默认字符集解码："+ new String(bytes));
        System.out.println("GBK字符集解码UTF-8："+ new String(bytes,"GBK"));
        System.out.println("GBK字符集解码GBK："+ new String(bytes2,"GBK"));
    }
}
