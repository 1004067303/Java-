public class StarProxy implements Face{
    Star star;
    public StarProxy(Star star){
        this.star=star;
    }
    @Override
    public String sing() {
        System.out.println("代理收钱10万出场费（唱歌）！！！");
        return star.sing();//通过代理去进行调用，而且可以在调用前后添加一些操作，但是由于是直接编码出代理类，所以可以看为是静态代理
    }

    @Override
    public void dance() {
        System.out.println("代理收钱5万出场费（跳舞）！！！");
         star.dance();
    }
}
