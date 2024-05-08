package homework4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Vehicles vehicle = null;
        Scanner sc = new Scanner(System.in);
        //环境
        String environment = sc.nextLine();
//        String environment = "大河";
        if (environment.equals("陆地")){
            vehicle = VehicleFactory.GetCar();
        }else{
            vehicle = VehicleFactory.GetBoat();
        }
        vehicle.work();
    }
}
