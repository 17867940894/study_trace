package Work;

public class TextCar {
    public static void main(String[] args) {
        trolleyBus t1 = new trolleyBus("特斯拉","黑色",4,"绿色牌照");
        trolleyBus t2 = new trolleyBus("蔚来","蓝色",4,"绿色牌照");
        trolleyBus[] trolleyBuses = {t1,t2};
        show(trolleyBuses);
        System.out.println();
        tankCan ta1 = new tankCan("大众","五颜六色",4,40);
        tankCan ta2 = new tankCan("林肯","黑色",6,60);
        tankCan[] tankCan = {ta1,ta2};
        show(tankCan);
    }

    public static void show(trolleyBus[] trolleyBus){
        for (trolleyBus t : trolleyBus){
            System.out.println(t.getName() + "\t" + t.getColor() + "\t" +  t.getWheel() + "轮\t" +  t.getLicencePlateColor());
        }
    }

    public static void show(tankCan[] tankCans){
        for (tankCan t : tankCans){
            System.out.println(t.getName() + "\t" + t.getColor() + "\t" +  t.getWheel() + "轮\t油箱容积" +  t.getFuelTank());
        }
    }
}
