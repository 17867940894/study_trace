package work.demo1;

public class Test {
    public static void main(String[] args) {
        Sun sun = new Sun( 5 , "张三" , "男");
        Daughter daughter = new Daughter(10 , "张美丽" , "女");
        System.out.println(sun.toString());
        System.out.println(daughter.toString());
        daughter.setName("大漂亮");
        System.out.println(daughter.toString());
    }
}
