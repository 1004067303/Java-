package Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public final  static Logger log= LoggerFactory.getLogger("Test");

    public static void main(String[] args) {
        chu(4,2);
    }
    public static void chu(int a ,int b){
        log.info("调用除法");
        int c= 0;
        try {
            c = a/b;
        } catch (Exception e) {
            log.error(e.toString());
        }
        System.out.println("结果是："+c);
        log.info("结果是："+c);
    }
}

