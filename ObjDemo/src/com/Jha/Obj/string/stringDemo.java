package com.Jha.Obj.string;

public class stringDemo {
    public static void main(String[] args) {
        String msg="abc.你好世界.!+芜湖。ce";
        String msg2="abc,你好世界!,+芜湖。Ce";
        String ms1="abc";
        String ms2="abc";
        String ms3=new String("abc");
        System.out.println(ms1==ms3);
        System.out.println("字符串长度："+msg.length());
        System.out.println("字符串14："+msg.charAt(14));
        char[] chars = msg.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar+" ");
        }
        System.out.println();
        System.out.println(msg.equals(msg2));
        System.out.println(msg.equalsIgnoreCase(msg2));
        System.out.println("截取长度为从4开始："+msg.substring(4));
        System.out.println("截取长度为从4开始到9："+msg.substring(4,9));
        System.out.println("将字符串c替换成!："+msg.replace('c', '!'));
        System.out.println("是否存在！："+msg2.contains("!"));
        System.out.println("是否a开头："+msg2.startsWith("a"));
        String[] split = msg.split("c");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
