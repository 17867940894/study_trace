package homework6;

public class Animal {
    private String name;
    private String food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Animal() {
    }

    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }
}
