package com.Jha.Obj.Movies;


import com.Jha.Base.ValueSend;

import java.util.Scanner;

public class MoviesDemo {
    public static void main(String[] args) throws Exception {
        Movies[] m= {new Movies(1,"电影1",64.5),
                new Movies(2,"电影2",35.5),
                new Movies(3,"电影3",65.0),};

        MovieOper oper=new MovieOper(m);
 /*       ValueSend v=new ValueSend();
        v.print(new int[]{1, 2, 3});*/

        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("====电影系统====");
            System.out.println("====输入命令====");
            System.out.println("1、查看全部电影");
            System.out.println("2、根据id搜索电影");
            System.out.println("exit、退出");
            System.out.print("请输入你的选择：");
            String flag = sc.next();
            switch (flag)
            {
                case "1":
                    oper.printMovies();
                    break;
                case "2":
                    System.out.print("输入你想要查询的ID：");
                    int i = sc.nextInt();
                    oper.printFindById(i);
                    break;
                case "exit":
                    return;
                default:
                    break;
            }

        }
    }
}
