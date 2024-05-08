package Work;

public class Zi_2 extends Fu{
    private String voice;//嗓门或声音

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Zi_2(String name, int age, String voice) {
        super(name, age);
        this.voice = voice;
    }

    public Zi_2(String voice) {
        this.voice = voice;
    }

    public Zi_2(String name, int age) {
        super(name, age);
    }

    public Zi_2() {
    }

    @Override
    void hobby() {
        System.out.println(getName() + "喜欢打篮球踮脚");
    }

    public void show() {
        System.out.println(getName() + "\t" + getAge()  + "岁,他的声音" + getVoice());
    }
}
