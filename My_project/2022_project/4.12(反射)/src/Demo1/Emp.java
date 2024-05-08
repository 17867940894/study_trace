package Demo1;

public class Emp {
    public static Integer Water = 100;
    private String name;
    private Integer age;
    private Double score;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public static Integer getWater() {
        return Water;
    }

    public static void setWater(Integer water) {
        Water = water;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Emp() {
    }

    public Emp(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
