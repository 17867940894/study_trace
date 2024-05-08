package House_rental_system.index;

import House_rental_system.bean.House;
import House_rental_system.util.HouseUtils;

import java.util.Scanner;

public class HouseView {
    private final Scanner sc = new Scanner(System.in);
    private final HouseUtils utils = new HouseUtils();
    private static House[] houses = new House[0];

    public void function(){
        System.out.println("1 新增房屋");
        System.out.println("2 查找房屋");
        System.out.println("3 删除房屋");
        System.out.println("4 修改房屋信息");
        System.out.println("5 房屋列表");
        System.out.println("0 退出");
    }

    //查找房屋
    public void findHouse() {
        System.out.print("请输入待查找的房屋编号(-1退出):");
        int houseId = sc.nextInt();
        House house = utils.findHouse(houseId);
        if (house == null) {
            System.out.println("房屋不存在");
        }else{
            System.out.println(house);
        }
    }

    //删除房屋信息
    public void deleteHouse() {
        System.out.print("请输入待删除的房屋编号(-1退出):");
        int houseId = sc.nextInt();
        if (houseId != -1){
            House house = utils.findHouse(houseId);
            if (house == null){
                System.out.println("房屋编号输入错误或不存在");
            }else{
                System.out.println("请确认是否删除(y/n):");
                System.out.print("请输入:");
                String answer = sc.nextLine();
                if (answer.equals("y")){
                    houses = utils.deleteLessee(house);
                    System.out.println("删除成功");
                }
            }
        }
    }

    //添加房屋信息
    public void addHouse() {
        System.out.print("姓名:");
        String lessee = sc.nextLine();
        System.out.print("电话:");
        String lesseeNumber = sc.nextLine();
        System.out.print("地址:");
        String address = sc.nextLine();
        System.out.print("月租:");
        Integer monthlyRent = sc.nextInt();
        System.out.print("状态(未出租/已出租):");
        //清空CharBuffer的缓存池
        sc.nextLine();
        String status = sc.nextLine();
        House house = new House(lessee, lesseeNumber, address, monthlyRent, status);
        houses = utils.addLessee(house);
        System.out.println("添加成功");
    }

    //遍历所有房屋信息
    public void showHouse() {
        if (houses.length == 0){
            System.out.println("暂无房屋");
            return;
        }
        for (House house : houses) {
            System.out.println(house);
        }
    }

    //修改房屋信息
    public void updateHouse() {
        System.out.print("请输入待修改的房屋编号(-1退出):");
        int houseId = sc.nextInt();
        if(houseId == -1){
            return;
        }
        House house = utils.findHouse(houseId);
        if (house == null){
            System.out.println("房屋不存在");
        }else{
            for (int i = 0; i < houses.length; i++) {
                if (houses[i].getHouseId() == house.getHouseId()) {
                    System.out.print("姓名(" + house.getLesseeName() + "):");
                    sc.nextLine();
                    String lesseeName = sc.nextLine();
                    System.out.print("电话(" + house.getLesseeNumber() + "):");
                    String lesseeNumber = sc.nextLine();
                    System.out.print("地址(" + house.getAddress() + "):");
                    String address = sc.nextLine();
                    System.out.print("月租(" + house.getMonthlyRent() + "):");
                    Integer monthlyRent = sc.nextInt();
                    System.out.print("状态(" + house.getStatus() + "):");
                    //清空CharBuffer的缓存池
                    sc.nextLine();
                    String status = sc.nextLine();
                    house = new House(lesseeName, lesseeNumber, address, monthlyRent, status);
                    houses[i] = house;
                }
            }
            System.out.println("修改成功");
        }
    }

    public static House[] getHouses() {
        return houses;
    }
}
