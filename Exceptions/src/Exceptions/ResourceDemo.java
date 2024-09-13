package Exceptions;

public class ResourceDemo {
    public static void main(String[] args) {
        try(MySource source=new MySource()){
            System.out.println(10/0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
