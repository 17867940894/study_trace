package Demo4;

public class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    public void cry(){
        System.out.println(name + "吼了两句");
    }
}
