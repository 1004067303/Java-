package IPDemo;

import java.io.IOException;
import java.net.InetAddress;

public class IPBaseDemo {
    public static void main(String[] args) throws IOException {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println("本机IP地址："+ip1.getHostAddress());
        System.out.println("本机主机名："+ip1.getHostName());

        InetAddress ip2 = InetAddress.getByName("www.bilibili.com");
        System.out.println("B站IP地址："+ip2.getHostAddress());
        System.out.println("B站主机名："+ip2.getHostName());
        System.out.println(ip2.isReachable(2000));
    }
}
