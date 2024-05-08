package string;

public class Demo1 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        /*
            s1和s2的地址值都在字符串常量池中，且调用的是同一个静态常量
         */
        System.out.println(s1 == s2);//true
        System.out.println("s1:  " + s1);
        System.out.println("s2:  " + s2);
        System.out.println("s3:  " + s3);
        /*
            s3是创建了一个String对象，地址值在堆内存中，
            即使调用的还是同一个字符串常量池中的静态常量，在" == "的判断中，由于地址的差异结果为false
         */
        System.out.println(s1 == s3);//false
        //字符串.equals()比较的是内容
        System.out.println(s1.equals(s3));//true
    }

}
