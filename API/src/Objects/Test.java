package Objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String msg1=null;
        String msg2="JHA";
        // msg1为空会空指针异常
        //System.out.println(msg1.equals(msg2));
        System.out.println(msg2 == msg1);
        System.out.println(Objects.equals(msg1, msg2));
    }
}
