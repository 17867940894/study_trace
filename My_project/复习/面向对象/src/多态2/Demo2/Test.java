package 多态2.Demo2;

import 接口.Work.HardWare;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Factory f = new Factory();
        for (;;){
            System.out.println("请输入：1.造键盘 2.造鼠标");
            int n = sc.nextInt();
            HardWare hardWare = f.build(n);
            System.out.println(hardWare);
        }
    }

}
class Factory{
    public HardWare build(int i){
        HardWare hardWare = null;
        if (i == 1){
            hardWare = new KeyBoard();
        }else if (i == 2){
            hardWare = new Mouse();
        }
        return hardWare;
    }
}

class Mouse extends HardWare {

}
class KeyBoard extends HardWare{

}

class Hardware{

}
