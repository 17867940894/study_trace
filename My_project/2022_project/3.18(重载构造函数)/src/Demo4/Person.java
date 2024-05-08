package Demo4;

public class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    //拿东西
    public void tain(Animal e){
        System.out.println(name + "把" + e.name + "拿起来");
    }

    //放下
    public void layDown(Animal e){
        System.out.println(name + "把" + e.name + "放进去");
    }
}
