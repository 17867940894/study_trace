package House_rental_system.util;

import House_rental_system.bean.House;
import House_rental_system.index.HouseView;

import java.util.Arrays;
import java.util.Scanner;

public class HouseUtils {

    Scanner sc = new Scanner(System.in);

    public House[] addLessee(House house) {
        House[] houses = Arrays.copyOf(HouseView.getHouses(), HouseView.getHouses().length + 1);
        houses[houses.length - 1] = house;
        return houses;
    }

    public House[] deleteLessee(House house) {
        House[] houses = HouseView.getHouses();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == house) {
                houses[i] = houses[houses.length - 1];
                break;
            }
        }
        houses = Arrays.copyOf(houses, houses.length - 1);
        return houses;
    }

    public House findHouse(int houseId) {
        House[] houses = HouseView.getHouses();
        if (houses.length == 0){
            return null;
        }
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getHouseId() == houseId) {
                return houses[i];
            }
        }
        return null;
    }
}
