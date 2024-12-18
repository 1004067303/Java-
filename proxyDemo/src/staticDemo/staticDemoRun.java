import Collections.Test.Card;

public class staticDemoRun {
    public static void main(String[] args) throws Exception {
        StarProxy starProxy=new StarProxy(new Star("芜湖怪人"));
        System.out.println(starProxy.sing());
        starProxy.dance();
        Card obj =(Card) Class.forName("Collections.Test.Card").getConstructor().newInstance();
        obj.setNumber(String.valueOf(12));
        System.out.println(obj);
    }
}
