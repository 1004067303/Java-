package Instance;

import java.time.Instant;

public class InstanceDemo {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println("总秒数："+now.getEpochSecond());
        System.out.println("不够一秒的纳秒数："+now.getNano());
    }
}
