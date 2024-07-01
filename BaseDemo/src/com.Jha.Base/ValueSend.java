package com.Jha.Base;

public class ValueSend {
    public static void main(String[] args) throws Exception {
        String s="你好";
        StringTest(s);
        System.out.println("主函数中参数："+s);
        int[] nums={1,2,3,4,5,6};
        int[] test=null;
        print(test);
        print(nums);
        numsTest(nums);
        System.out.println("主函数中参数："+nums[1]);
        print(nums);
    }
    public static void StringTest(String s)
    {
        System.out.println("传入的参数："+s);
        s="测试";
        System.out.println("修改后的参数："+s);
    }

    public static void numsTest(int[] s) throws Exception {
        System.out.println("传入的参数："+s[1]);
        s[1]=21;
        System.out.println("修改后的参数："+s[1]);
        print(s);
    }
    public  static  void    print(int[] s) throws Exception {

        if (s!=null) {
            System.out.print("[");
            for (int i = 0; i < s.length; i++) {
               /* if(i==0)
                    System.out.print("["+s[i]+",");
                else if (i==s.length-1) {
                    System.out.println(s[i]+"]");
                }
                else {
                    System.out.print(s[i]+",");
                }*/
                System.out.print(i==s.length-1?s[i]:s[i]+",");
            }
            System.out.println("]");
        }
        else {
            throw new Exception("空指针异常");
        }
    }
}
