package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
    public static void main(String[] args) {

        System.out.println(0.1+0.2);//结果会失真 0.30000000000000004
        BigDecimal b1=new BigDecimal("99.99999");

        BigDecimal b2=new BigDecimal(Double.toString(99.99919));
        BigDecimal bigDecimal = BigDecimal.valueOf(999);
        BigDecimal b3 = BigDecimal.valueOf(0.1);
        BigDecimal b4 = BigDecimal.valueOf(0.2);

        System.out.println(b1.add(b2).subtract(bigDecimal));
        System.out.println(bigDecimal);
        System.out.println(b3.add(b4));
        System.out.println(b3.multiply(b4));
        System.out.println(b3.divide(b4,4, RoundingMode.UP));
        double v = b3.divide(b4, 4, RoundingMode.UP).doubleValue();
        System.out.println(v);
    }
}
