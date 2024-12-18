
public class Star implements Face {
    String  name;
    public Star(String  name){
        this.name=name;
    }
    public Star(){

    }
    @Override
    public String sing() {
        System.out.println(name+"开始唱歌！！！！");
        return  "谢谢！！！";
    }

    @Override
    public void dance() {
        System.out.println(name+"开始跳舞！！！！");
    }
}
