package homework4;
//交通工具工厂类
public class VehicleFactory {

    public static Car GetCar(){
        return new Car();
    }

    public static Boat GetBoat(){
        return new Boat();
    }
}
