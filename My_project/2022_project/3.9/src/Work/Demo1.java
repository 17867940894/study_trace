package Work;

/*
1.定义4个int类型的变量a、b、c、d并赋值，
计算a、b较大者和c、d较小者的乘积
2.int a = 3,b = 4;
单独计算每个表达式的值和a、b的结果：
（1）a++ > --b + a
（2）--a > ++b && a-- > b++
（3）--a > ++b | a-- > b++
3.判断一个年份是否是闰年，
如果是闰年，输出“是闰年”，
不是闰年，输入“不是闰年”
 */
public class Demo1 {
    public static void main(String[] args) {
         int year = 2000;
        System.out.println(year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? "是世纪闰年" : "不是闰年") : "是闰年") : "不是闰年");
    }
}
