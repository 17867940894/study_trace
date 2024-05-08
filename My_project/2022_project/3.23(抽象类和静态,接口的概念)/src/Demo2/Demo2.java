package Demo2;

public class Demo2 {
    private String name;
    private int age;
    static double water = 100;//TODO 被static修饰的成员变量,可以通过本类名称来调用，且不同地址的本类对象WATER都是同一个值，是共享的

    public static void a(){
        //System.out.println(name);报错 TODO 静态成员是随着类的加载而加载，静态方法里找非静态成员，就是在内存里找一个本不存在的值，在找非静态成员前，只能创建对象
        System.out.println(water);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo2() {
    }

    public Demo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void show(Demo2 d,int i){
        water = water - i;
        System.out.println(d.getName() + "喝了," + i + "升水,还剩" + water + "升水");
    }
    public static void Addshow(Demo2 d,int i){
        water = water + i;
        System.out.println(d.getName() + "吐了," + i + "升水,还剩" + water + "升水");
    }
}
