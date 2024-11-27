package JunitUtils;

public class MyUtils {
    public static int getMaxIndex(String msg){
        int length=0;
        if(msg==null||msg==""){
            length= -1;
        }else{
        length=msg.length()-1;
        }
        return length;
    }


    public static void getLength(String msg){
        System.out.println(msg+"的长度为："+msg.length());
    }
}
