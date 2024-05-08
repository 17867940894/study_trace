package Demo4;

public class Text {
    public static void main(String[] args) {
        Person p = new Person("张三");
        Animal a = new Animal("大象");
        refrigerator r = new refrigerator();
        r.openTheDoor(p);
        p.tain(a);
        a.cry();
        p.layDown(a);
        r.CloseTheDoor(p);
    }
}
