package inherit;

public class Employee {
    String name;
    int age;
    double salary;
    String station;

    public void show(){
        System.out.println("工资为:" + salary);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Employee() {
    }

    public Employee(String name, int age, double salary, String station) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.station = station;
    }
}
