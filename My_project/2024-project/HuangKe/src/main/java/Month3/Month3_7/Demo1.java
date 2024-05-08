package Month3.Month3_7;

import Month3.Month3_7.dao.Person;
import util.GetScanner;

import java.util.Scanner;

public class Demo1 {

    //自己写的工具类直接获取Scanner
    static Scanner sc = GetScanner.getScanner();

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~1~~~~~~~~~~~");
        work1();
        System.out.println("~~~~~~~~~~~2~~~~~~~~~~~");
        work2();
        System.out.println("~~~~~~~~~~~3~~~~~~~~~~~");
        work3();
        System.out.println("~~~~~~~~~~~4~~~~~~~~~~~");
        work4();
        System.out.println("~~~~~~~~~~~5~~~~~~~~~~~");
        work5();
        System.out.println("~~~~~~~~~~~6~~~~~~~~~~~");
        work6();
    }

    /*
    保存两本书名，用加号拼接，看效果
    保存两本书的价格用加号拼接，看效果
     */
    private static void work6() {
        String book1 = "金瓶梅" ;
        Double price1 = 18d;
        String book2 = "钢铁是怎样炼成的" ;
        Double price2 = 9.9d;
        System.out.println(book1 + book2);
        System.out.println(price1 + price2);
    }

    /*
    编程实现如下结果
	姓名	年龄	成绩	性别	爱好
	xxx	xxx	xxx	xxx	xxx
     */
    private static void work5() {
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" +
                "xxx\txxx\txxx\txxx\txxx");
    }

    //使用char类型，分别保存 \n \t \\  \r 等转义字符，并打印出来
    private static void work4() {
        char c1 = '\n' , c2 = '\t' , c3 = '\\' , c4 = '\r';
        System.out.println("c1:\\n");
        System.out.println("c2:\\t");
        System.out.println("c3:" + c3 + c3);
        System.out.println("c4:\\r");

    }

    // 2.6 习题
    private static void work3() {
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        Integer age = sc.nextInt();
        System.out.println("请输入性别");
        String sex = sc.next();
        System.out.println("请输入身高");
        Double height = sc.nextDouble();
        System.out.println("请输入体重");
        Double weight = sc.nextDouble();
        System.out.println("请输入住址");
        String address = sc.next();
        System.out.println("请输入电话");
        String phone = sc.next();
        Person person = new Person(name,age,sex,height,weight,address,phone);
        System.out.println(person);
    }

    // 2.6 习题
    private static void work2() {
        System.out.println("欢迎使用会员管理菜单：1.显示会员信息 2.添加会员信息 3.修改会员信息 4.查询会员信息");
    }

    //任务2-1
    private static void work1() {
        System.out.println("\t商品价目表\n序号\t商品名称\t\t商品单价\t\n1\t美的电饭煲\t300\n2\t小米充电宝\t79");
    }

}
