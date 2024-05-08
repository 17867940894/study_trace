package string;

public class Demo2 {
    public static void main(String[] args) {

        /*byte[] b = {97,98,99,100,48};
        String by = new String(b);//TODO 传入时会自动转回成ASCII码表对应的十进制数值
        System.out.println(by);
        String byt = new String(b,1,4);
        //TODO String 变量名 = new String(byte[],a,b);截取传入byte数组,从a开始，截取b个数值拼接成字符串
        System.out.println(byt);*/


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

        /*String s = "012345067890";
        //TODO 返回此字符串中从左到右最后一个需要查找元素的下标
        System.out.println(s.lastIndexOf("0"));
        //TODO 返回此字符串中已规定的下标位置从右往左的第一个需要查找元素的下标
        System.out.println(s.lastIndexOf("0" , 7));*/

        String str = "123456789";
        //将字符串中一个或多个a字符替换成b字符
        String replace1 = str.replace('1', '+');
        //将字符串中一个或多个a字符串替换成b字符串
        String replace2 = str.replace("123", "+++");
        System.out.println(replace1);
        System.out.println(replace2);
    }
}
