package puzzle;

import java.util.Random;
import java.util.Scanner;

public class puzzle {
    private int level;//游戏难度
    private int[][] standard;//标准答案
    private int[][] unstable;//游戏中变动的二维数组
    private int[][] playBack;//回放用的数组
    private int[] zero;//0的下标
    private long startTime;//开始时间
    private long endTime;//结束时间
    private String step = "";//步数

    Scanner sc = new Scanner(System.in);

    //游戏开始画面
    public void initialScreen(int leave) {
        correct();
        disorganize();
        move();
    }

    //游戏开始
    public void move() {
        startTime = System.currentTimeMillis();
        do {
            System.out.println("请输入：w.上移 s.下移 a.左移 d.右移");
            String s = sc.next();
            zero = findZero(unstable);
            switch (s) {
                case "w":
                    moveUp();
                    break;
                case "s":
                    moveDown();
                    break;
                case "a":
                    moveLeft();
                    break;
                case "d":
                    moveRight();
                    break;
                case "nb":
                    nb();
                    break;
            }
            show();

        } while (!estimate());
        System.out.println("恭喜你完成了拼图！是否查看回放?1.看 2.不看");
        endTime = System.currentTimeMillis();
        String ss = sc.next();
        if (ss.equals("1")) {
            //System.out.println(step);
            playback(step);
        }
        System.out.println("所用时间：" + (endTime - startTime) / 1000 + "秒");
        System.out.println("步数：" + step.length());
    }

    //回放
    private void playback(String step) {
        for (int i = step.length() - 1; i >= 0; i--) {
            zero = findZero(playBack);
            System.out.println("\n第" + "\t" + (i + 1) + "\t" + "步");
            String s = step.charAt(i) + "";
            if (s.equals("w")) {
                s = "s";
            } else if (s.equals("s")) {
                s = "w";
            } else if (s.equals("a")) {
                s = "d";
            } else if (s.equals("d")) {
                s = "a";
            }
            switch (s) {
                case "w":
                    Up(playBack);
                    break;
                case "s":
                    Down(playBack);
                    break;
                case "a":
                    Left(playBack);
                    break;
                case "d":
                    Right(playBack);
                    break;
                case "nb":
                    nb();
                    break;
            }
            show();
        }
    }

    //作弊
    private void nb() {
        unstable = standard;
    }

    //打乱拼图
    private void disorganize() {
        unstable = new int[level][level];
        for (int i = 0; i < standard.length; i++) {
            for (int j = 0; j < standard[i].length; j++) {
                unstable[i][j] = standard[i][j];
            }
        }
        Random r = new Random();
        for (int i = 1; i <= Math.pow(level, 4); i++) {
            int num = r.nextInt(4);
            zero = findZero(unstable);
            switch (num) {
                case 0:
                    Up(unstable);
                    break;
                case 1:
                    Down(unstable);
                    break;
                case 2:
                    Left(unstable);
                    break;
                case 3:
                    Right(unstable);
                    break;
            }
        }
        playBack = unstable;
        show();
    }

    //上移
    private void Up(int[][] arr) {
        int x = zero[0];
        int y = zero[1];
        if (x - 1 < 0) {
            return;
        }
        int n = arr[x - 1][y];
        arr[x - 1][y] = 0;
        arr[x][y] = n;
    }

    //上移
    private void moveUp() {
        int x = zero[0];
        int y = zero[1];
        if (x - 1 < 0) {
            return;
        }
        int n = unstable[x - 1][y];
        unstable[x - 1][y] = 0;
        unstable[x][y] = n;
        step += "w";
    }

    //下移
    private void Down(int[][] arr) {
        int x = zero[0];
        int y = zero[1];
        if (x + 1 == level) {
            return;
        }
        int n = arr[x + 1][y];
        arr[x + 1][y] = 0;
        arr[x][y] = n;
    }

    //下移
    private void moveDown() {
        int x = zero[0];
        int y = zero[1];
        if (x + 1 == level) {
            return;
        }
        int n = unstable[x + 1][y];
        unstable[x + 1][y] = 0;
        unstable[x][y] = n;
        step += "s";
    }

    //左移
    private void Left(int[][] arr) {
        int x = zero[0];
        int y = zero[1];
        if (y == 0) {
            return;
        }
        int n = arr[x][y - 1];
        arr[x][y - 1] = 0;
        arr[x][y] = n;
    }

    //左移
    private void moveLeft() {
        int x = zero[0];
        int y = zero[1];
        if (y == 0) {
            return;
        }
        int n = unstable[x][y - 1];
        unstable[x][y - 1] = 0;
        unstable[x][y] = n;
        step += "a";
    }

    //右移
    private void Right(int[][] arr) {
        int x = zero[0];
        int y = zero[1];
        if (y == level - 1) {
            return;
        }
        int n = arr[x][y + 1];
        arr[x][y + 1] = 0;
        arr[x][y] = n;
    }

    //右移
    private void moveRight() {
        int x = zero[0];
        int y = zero[1];
        if (y == level - 1) {
            return;
        }
        int n = unstable[x][y + 1];
        unstable[x][y + 1] = 0;
        unstable[x][y] = n;
        step += "d";
    }

    //标准答案
    private void correct() {
        standard = new int[level][level];
        for (int i = 0; i < level * level; i++) {
            standard[i / level][i % level] = i;
        }
    }

    //展示拼图
    private void show() {
        for (int i = 0; i < unstable.length; i++) {
            for (int j = 0; j < unstable[i].length; j++) {
                System.out.print(unstable[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //判断是否完成拼图
    private boolean estimate() {
        for (int i = 0; i < standard.length; i++) {
            for (int j = 0; j < standard[i].length; j++) {
                if (unstable[i][j] != standard[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 找零（找空白）
    private int[] findZero(int[][] arr) {
        int[] rank = new int[2];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                if (arr[i][j] == 0) {
                    rank[0] = i;
                    rank[1] = j;
                    return rank;
                }
            }
        }
        return rank;
    }

    public puzzle() {
    }

    public int getLeave() {
        return level;
    }

    public void setLeave(int leave) {
        this.level = leave;
    }

    public puzzle(int leave) {
        this.level = leave;
    }
}
