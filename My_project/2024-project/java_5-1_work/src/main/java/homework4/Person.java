package homework4;

public class Person {
    private String name;
    private Vehicles vehicles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public Person() {
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
}
