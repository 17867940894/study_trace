package inherit;

public class Programmer extends Employee{

    String Key;

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", station='" + station + '\'' +
                ", Key='" + Key + '\'' +
                '}';
    }

    @Override
    public void show(){
        System.out.println("罢工");
    }

}
