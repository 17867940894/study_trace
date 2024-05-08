public class Demo1 {
    //找出人名数组中最长的人名和姓张的人
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五", "张狗屎啊", "欧阳才秀"};
        int m = 0;
        for (int j = 0; j < names.length; j++) {
            m = m >= names[j].length() ? m : names[j].length();
        }
        System.out.print("姓张的有:\t");
        for (int j = 0; j < names.length; j++) {
            if (names[j].startsWith("张"))
                System.out.print(names[j] + "\t");
        }
        System.out.print("\n名字最长的有:\t");
        for (int j = 0; j < names.length; j++) {
            if (names[j].length() == m)
                System.out.print(names[j] + "\t");
        }
    }
}
