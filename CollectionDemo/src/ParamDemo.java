import java.util.Arrays;

public class ParamDemo {
    public static void main(String[] args) {
        test("方法1");
        test("方法1",1,1,1,1);
        test("方法1",new int[]{1,1,1,1,1});
    }
    public static void test(String msg,int...nums){
        System.out.println("字符串为："+msg);
        System.out.println("可变参数长度为："+nums.length);
        System.out.println("可变参数为："+ Arrays.toString(nums));
    }
}
