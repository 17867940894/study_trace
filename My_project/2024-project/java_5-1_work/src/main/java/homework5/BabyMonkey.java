package homework5;

public class BabyMonkey extends Monkey implements Fish , Fowl{
    @Override
    public void Swimming() {
        System.out.println("会游泳");
    }

    @Override
    public void flight() {
        System.out.println("会飞");
    }
}
