package work.Demo2;

public class Test {
    public static void main(String[] args) {
        keyboard keyboard = new keyboard(388 ,"燕双鹰" , 128);
        Mouse mouse = new Mouse(188 ,"罗技" , 60);
        Computer computer = new Computer();
        computer.start();
        computer.boot(keyboard);
        computer.boot(mouse);
        computer.shutdown(keyboard);
        computer.shutdown(mouse);
        computer.close();
    }
}
