package Instance;

import java.time.Instant;

public class InstanceDemo {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("获取现在时间信息："+now);
        System.out.println("总秒数："+now.getEpochSecond());
        System.out.println("不够一秒的纳秒数："+now.getNano());
        Instant plus = now.plusSeconds(10);
        System.out.println("增加十秒后的时间："+ plus);
        Instant minus = now.minusSeconds(30);
        System.out.println("减少三十秒后的时间："+ minus);
        System.out.println(plus+"在"+minus+"之后吗："+plus.isAfter(minus));

    }
}
