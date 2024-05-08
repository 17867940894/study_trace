package homework6;

//饲养员
public class Feeder {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Feeder() {
    }

    public Feeder(String name) {
        this.name = name;
    }

    public void feeding(Animal animal){
        System.out.println(this.getName() +  "给" + animal.getName() + "喂" + animal.getFood());
    }
}
