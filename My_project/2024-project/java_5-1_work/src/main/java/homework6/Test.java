package homework6;

public class Test {
    public static void main(String[] args) {
        Feeder feeder1 = new Feeder("饲养员一号");
        Feeder feeder2 = new Feeder("饲养员二号");

        Animal monkey = new Monkey("吉吉大王","香蕉");
        feeder1.feeding(monkey);
        Animal panda = new Panda("欢欢","竹子");
        feeder2.feeding(panda);
    }
}
