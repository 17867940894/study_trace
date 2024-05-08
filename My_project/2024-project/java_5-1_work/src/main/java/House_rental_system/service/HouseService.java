package House_rental_system.service;

import House_rental_system.index.HouseView;

public class HouseService {

    private final HouseView view;
    public HouseService(HouseView view) {
        this.view = view;
    }

    public void functionExecution(int userInput) {
        if (userInput == 1){
            view.addHouse();
        }else if (userInput == 2){
            view.findHouse();
        }else if (userInput == 3){
            view.deleteHouse();
        }else if (userInput == 4){
            view.updateHouse();
        }else if (userInput == 5){
            view.showHouse();
        }
    }
}
