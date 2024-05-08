package puzzle;

import java.util.Scanner;

public class TestPuzzle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        puzzle p = new puzzle();

        System.out.println("---------------哟西，这是一个正经的拼图-----------------");
        System.out.println("请输入: 1.开始游戏 2.查看排行 3.退出 ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("请选择难度:1.简单 2.一般 3.困难 4.地狱 5.兰德里的折磨");
            int level = sc.nextInt() + 2;
            p.setLeave(level);
            p.initialScreen(level);
        } else if (num == 2) {
            System.out.println("写不来");
        } else if (num == 3) {
            System.out.println("游戏伤肾，请适度.");
            System.exit(0);
        }
    }
}
