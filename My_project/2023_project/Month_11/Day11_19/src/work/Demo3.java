package work;

public class Demo3 {
    /**
     * 定义方有两个String参数：a,b 输出每个参数b在a中的位置
     */
    public static void main(String[] args) {
        function("8208208820" , "0");
    }

    private static void function(String a , String b ){
        System.out.print("下标位置：");
        for (int i = 0; i < a.length(); i++) {
            if (b.equals(a.charAt(i) + ""))
                System.out.print(i + "\t");
        }
    }
}
