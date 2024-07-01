package com.Jha.Obj.ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static final Account a =new Account("11","test","111111",'男',100000,8000);
    ArrayList<Account> list=new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    /*
    1、用户登陆
    2、用户开户
    3、退出
        1、查询账户
        2、存款
        3、取款
        4、转账
        5、修改密码
        6、退出
        7、注销账户
     */
    //启动方法
    public void start()
    {
        list.add(a);
        while (true)
        {
            System.out.println("======欢迎进入银行系统！！=======");
            System.out.println("请选择你想要的功能");
            System.out.println("1、用户登陆");
            System.out.println("2、用户开户");
            System.out.println("3、退出系统");
            switch (sc.next())
            {
                case "1":
                    if(this.list.isEmpty())
                    {
                        System.out.println("当前系统并无账户，不可登陆！请先开户");
                        break;
                    }
                    System.out.print("请输入用户名：");
                    String userName= sc.next();
                    System.out.print("请输入密码：");
                    String passWord= sc.next();
                    Account login = Login(userName, passWord);
                    if(login!=null)
                    {
                        System.out.println(userName+"登陆成功");
                        //查询等操作开始页面
                        boolean work = work(login);
                        if (!work)
                        {
                            return;
                        }
                    }

                    break;
                case "2":
                     CreateAccount();
                    break;
                case "3":
                    System.out.println("成功退出系统，下次再见！！!");
                    return;
                default:
                    System.out.println("输入命令有误！！！请重新输入！");
            }
        }
    }
    public Account Login(String userName,String passWord)
    {

        Account refAccount=null;
        for (Account account : this.list) {
            if(userName.equals(account.getUserName())&&passWord.equals(account.getPassWord()))
            {
                refAccount= account;
            }

        }
        return refAccount;
    }
    public void CreateAccount()
    {
        System.out.println("============欢迎进入开户页面===========");
        System.out.print("请输入卡号：");
        String cardId = sc.next();
        System.out.print("请输入用户名：");
        String userName = sc.next();
        System.out.print("请输入密码：");
        String passWord = sc.next();
        System.out.print("请输入性别：");

        char sex= 0;
        checkSex(sc,sex);
        System.out.print("请输入余额：");
        Double money=sc.nextDouble();
        System.out.print("请输入限额：");
        Double xianE=sc.nextDouble();
        Account account=new Account(cardId,userName,passWord,sex,money,xianE);
        boolean add = this.list.add(account);
        if(add)
        {
            System.out.println("用户开户成功！");
        }
        else
        {
            System.out.println("用户开户失败！");
            return;
        }

    }

    public void checkSex(Scanner sc,char sex)
    {
        while (true) {
            sex = sc.next().charAt(0);
            if(sex!='男' & sex!='女')
            {
                System.out.print("性别输入错误，请重新输入（男或女）：");
            }
            else {
                break;
            }
        }
    }
    public boolean work(Account login)
    {
        while (true){


          /*  1、查询账户
            2、存款
            3、取款
            4、转账
            5、修改密码
            6、退出
            7、注销账户*/
            System.out.println("=========="+login.getUserName() +"~欢迎进入银行系统！！=======");
            System.out.println("请选择你想要的功能");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            switch (sc.next())
            {
                case "1":
                    System.out.println(login.getUserName()+"的余额为："+login.getMoney());
                    break;
                case "2":
                    CunKuan(login);
                    break;
                case "3":
                    System.out.print("请输入你想要取出的金额：");
                    double moneys= sc.nextDouble();
                   /* if(moneys>login.getXianE())
                    {
                        System.out.println("您的取款金额大于取款限额~");
                    }else {
                        if (moneys > login.getMoney()) {
                            System.out.println("您的余额不足~~");
                        }
                        login.setMoney(login.getMoney() - moneys);
                        System.out.println("您取款后余额为："+login.getMoney());
                    }*/
                    checkMoney(login,moneys);
                    break;
                case "4":
                    if(this.list.size()<2)
                    {
                        System.out.println("系统没有足够的用户进行转账操作~");
                    }
                    System.out.print("请输入对方账户卡号：");
                    String CardId= sc.next();
                    System.out.print("请输入转账金额：");
                    double m=sc.nextDouble();
                    for (Account account : this.list) {
                        if (CardId.equals(account.getCardId()))
                        {
                            checkMoney(login,m);
                            account.setMoney(account.getMoney()+m);
                            System.out.println("账户"+account.getUserName()+"的余额为："+account.getMoney());
                        }
                    }
                    //转账
                    break;
                case "5":
                    //修改密码
                    System.out.print("请输入原密码：");
                    String pass = sc.next();
                    if(pass.equals(login.getPassWord()))
                    {
                        System.out.print("请输入新密码：");
                        String newPassWord = sc.next();
                        System.out.print("请再次输入新密码：");
                        String RePassWord = sc.next();
                        if(newPassWord.equals(RePassWord))
                        {
                            login.setPassWord(newPassWord);
                            System.out.println("修改密码成功，请重新登陆");
                            return true;
                        }
                        else
                        {
                            System.out.println("两次密码不一致！！");
                        }
                    }
                    break;
                case "6":
                    //退出
                    System.out.println("成功退出系统，下次再见！！!");
                    return false;
                case "7":
                    //注销账户
                    System.out.print("您正在注销账户！！请确认是否真的注销！请输入（是：Y，否：N）：");
                    String s= sc.next();
                    if (s.equals("Y"))
                    {
                        if(list.remove(login))
                        {
                            System.out.println("您的账号注销成功！！！");
                            return false;
                        }else {
                            System.out.println("出现错误~请联系管理员");
                            return false;
                        }
                    } else if (s.equals("N")) {
                        System.out.println("取消注销~为您返回上一页面~");
                    }
                    break;
                default:
                    System.out.println("您输入的命令有误~ 请重新输入！");
                    break;
            }
        }
    }
    public void CunKuan(Account login)
    {
        while (true) {
            System.out.print("请输入你想要存入的金额：");
            double money = sc.nextDouble();
            if (money > 0) {
                login.setMoney(login.getMoney() + money);
                System.out.println("存入了" + money + "元，现在的余额为：" + login.getMoney());
                break;
            } else {
                System.out.println("您输入的金额不正确~请重新输入！！");
            }
        }
    }
    public void checkMoney(Account account,double moneys)
    {
        if(moneys>account.getXianE())
        {
            System.out.println("您的支出金额大于限额~");
        }else {
            if (moneys > account.getMoney()) {
                System.out.println("您的余额不足~~");
            }
            account.setMoney(account.getMoney() - moneys);
            System.out.println("您消费后余额为："+account.getMoney());
        }
    }
}
