package work.Demo2;

public class Test {
    public static void main(String[] args) {
        Audi audi_1 = new Audi("很好");
        Audi audi_2 = new Audi("奥迪" , 20000 , "很好");
        System.out.println(audi_1.toString());
        System.out.println(audi_2.toString());
    }
}
