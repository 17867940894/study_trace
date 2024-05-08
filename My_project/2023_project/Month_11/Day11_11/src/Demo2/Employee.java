package Demo2;

public class Employee {
    String name = "employee";
    public void show(){
        System.out.println("Employee的show方法");
    }
}

class Programmer extends Employee{
    String name = "programmer";
    public void show(){
        System.out.println("programmer的show方法");
    }
}
