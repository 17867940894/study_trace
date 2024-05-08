package 常用类.StringText;
//TODO String 类型的值既不在栈内存，也不在堆内存，由一个单独的字符串常量池来存储。
public class StringText {

    public static void main(String[] args) {
        String name1 = "张三";
        String name2 = "李四";
        String name3 = "王五";
        String name4 = "赵六";

        byte[] b = {97,98,99,100,48};
        String by = new String(b);//TODO 传入时会自动转回成ASCII码表对应的十进制数值
        System.out.println(by);
        String byt = new String(b,1,4);
        //TODO String 变量名 = new String(byte[],a,b);截取传入byte数组,从a开始，截取b个数值拼接成字符串
        System.out.println(byt);


        /*char[] c = {'q','w','e','r'};
        String ch = new String(c);
        String cha = new String(c,0,3);
        //TODO String 变量名 = new String(char[],a,b);截取传入char数组,从a开始，截取b个数值拼接成字符串
        System.out.println(ch);
        System.out.println(cha);*/


        /*String s = new String("8208208820");
        s = s + 1;
        System.out.println(s);//TODO 这是算术运算
        s = s + "a";
        System.out.println(s);//TODO 这是字符串拼接
        System.out.println(s + 2);//TODO 这是字符串拼接*/


        /*System.out.println(name1 == name2);//TODO false
        name3 = name4;
        System.out.println(name3 == name4);//TODO true
        //TODO ==比较的是地址，如果要比较内容的话用equals,它比较的是内容
        System.out.println(name3.equals("赵六"));//TODO true
        */

    }
}
