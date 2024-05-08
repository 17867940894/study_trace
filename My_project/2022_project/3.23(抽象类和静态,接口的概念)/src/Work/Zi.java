package Work;

public class Zi extends Fu{
    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public Zi(String name, int age, String figure) {
        super(name, age);
        this.figure = figure;
    }

    public Zi(String figure) {
        this.figure = figure;
    }

    private String figure ;//身材
    public Zi(String name, int age) {
        super(name, age);
    }

    public Zi() {
    }

    @Override
    void hobby() {
        System.out.println(getName() + "喜欢踢足球假摔");
    }

    public void show() {
        System.out.println(getName() + "\t" + getAge()  + "岁,身材很" + getFigure());
    }
}
