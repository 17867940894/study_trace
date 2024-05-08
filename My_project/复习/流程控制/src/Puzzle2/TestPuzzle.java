package Puzzle2;

import java.util.Scanner;

public class TestPuzzle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PuzzleService2 ps = new PuzzleService2();

        System.out.println("------祖安拼图------");
        System.out.println("请输入：1.开始游戏 2.查看排行 3.退出游戏");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("请选择游戏难度：1.简单 2.普通 3.困难");
            int level = sc.nextInt() + 2;
            ps.setLevel(level);
            ps.initPuzzle();
            ps.play();
        } else if (num == 2) {
            // TODO 查看排行
        } else {
            // TODO 退出
        }


    }
}
