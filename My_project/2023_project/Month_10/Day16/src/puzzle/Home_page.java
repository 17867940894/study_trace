package puzzle;

import java.util.Scanner;

public class Home_page {

    public static void main(String[] args) {
        Function function = new Function();
        System.out.println("拼图游戏");
        Scanner sc = new Scanner(System.in);
        System.out.println("请您选择游戏的难度: 1.入门  2.简单  3.困难  4：地狱");
        function.difficulty(sc.nextInt() + 2);
        do{
            Function.findZeroIndex();
            System.out.println("w:上移  s:下移  a:左移  d:右移");
            switch (sc.next()){
                case "w":
                    Function.up();
                    break;
                case "s":
                    Function.down();
                    break;
                case "a":
                    Function.left();
                    break;
                case "d":
                    Function.right();
                    break;
            }
            function.show();
        }while (!Function.checkout());
        System.out.println("太厉害了吧");
    }

}
