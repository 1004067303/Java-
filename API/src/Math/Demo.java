package Math;

public class Demo {
    public static final Double A=3.9;
    public static final Double B=4.0;
    public static final Double C=4.1;
    public static final Double D=4.4;
    public static final Double E=4.5;
    public static final Double F=4.6;
    public static void main(String[] args) {

        System.out.println("取绝对值："+Math.abs(-1));
        System.out.println("================================");
        System.out.println(A+"向上取整："+Math.ceil(A));
        System.out.println(B+"向上取整："+Math.ceil(B));
        System.out.println(C+"向上取整："+Math.ceil(C));
        System.out.println("================================");
        System.out.println(A+"向下取整："+Math.floor(A));
        System.out.println(B+"向下取整："+Math.floor(B));
        System.out.println(C+"向下取整："+Math.floor(C));
        System.out.println(D+"向下取整："+Math.floor(D));
        System.out.println("================================");
        System.out.println(A+"四舍五入："+Math.round(A));
        System.out.println(B+"四舍五入："+Math.round(B));
        System.out.println(C+"四舍五入："+Math.round(C));
        System.out.println(D+"四舍五入："+Math.round(D));
        System.out.println(E+"四舍五入："+Math.round(E));
        System.out.println(F+"四舍五入："+Math.round(F));
        System.out.println("================================");
        System.out.println("取次方："+Math.pow(2,3));
        System.out.println("================================");
        System.out.println("取随机数[0.0-1.0)："+Math.random());
    }
}
