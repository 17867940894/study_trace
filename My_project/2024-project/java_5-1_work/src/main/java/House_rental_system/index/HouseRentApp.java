package House_rental_system.index;

import House_rental_system.service.HouseService;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRentApp {

    public static void main(String[] args) {
        System.out.println("-------房屋出租系统-------");
        Scanner sc = new Scanner(System.in);
        HouseView view = new HouseView();
        HouseService service = new HouseService(view);
        //接收用户输入的值
        int userInput;
        do {
            view.function();
            userInput = sc.nextInt();
            //执行功能
            service.functionExecution(userInput);
        } while (userInput != 0);
        System.out.println(Arrays.toString(HouseView.getHouses()));
        System.out.println("欢迎下次使用");
    }
}
