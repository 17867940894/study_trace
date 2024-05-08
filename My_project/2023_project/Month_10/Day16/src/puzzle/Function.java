package puzzle;

import java.util.Random;

public class Function {

    static int[][] key ;
    static int[][] puzzle;
    static int[] zeroIndex = new int[2];

    public static void up() {
        if (zeroIndex[0] == 0){
            System.out.println("不可上移");
            return;
        }
        int index1 = zeroIndex[0];
        int index2 = zeroIndex[1];
        int num = puzzle[index1 - 1][index2];
        puzzle[index1 - 1][index2] = 0;
        puzzle[index1][index2] = num;
    }

    public static void left() {
        if (zeroIndex[1] == 0){
            System.out.println("不可左移");
            return;
        }
        int index1 = zeroIndex[0];
        int index2 = zeroIndex[1];
        int num = puzzle[index1][index2 - 1];
        puzzle[index1][index2 - 1] = 0;
        puzzle[index1][index2] = num;
    }

    public static void down() {
        if (zeroIndex[0] == puzzle.length-1){
            System.out.println("不可下移");
            return;
        }
        int index1 = zeroIndex[0];
        int index2 = zeroIndex[1];
        int num = puzzle[index1 + 1][index2];
        puzzle[index1 + 1][index2] = 0;
        puzzle[index1][index2] = num;
    }

    public static void right() {
        if (zeroIndex[1] == puzzle.length-1){
            System.out.println("不可右移");
            return;
        }
        int index1 = zeroIndex[0];
        int index2 = zeroIndex[1];
        int num = puzzle[index1][index2 + 1];
        puzzle[index1][index2 + 1] = 0;
        puzzle[index1][index2] = num;
    }

    //定位0的下标
    public static void findZeroIndex() {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                if (puzzle[i][j] == 0){
                    zeroIndex[0] = i;
                    zeroIndex[1] = j;
                }
            }
        }
    }

    //显示打乱后的二维数组
    public void difficulty(int difficulty) {
        puzzle = new int[difficulty][difficulty];
        key = new int[difficulty][difficulty];
        int index = 0;
        //有序赋值
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                key[i][j] = index;
                puzzle[i][j] = index;
                index++;
            }
        }
        disrupt_puzzle();
    }

    //打乱二维数组
    private void disrupt_puzzle() {
        Random r = new Random();
        int max = puzzle.length*puzzle.length;
        //利用一维数组进行打乱成无序的一维数组
        int[] unordered = new int[max];
        for (int i = 0; i < max; i++) {
            unordered[i] = i;
        }
        for (int i = 0; i < max; i++) {
            /**
             * 下标的互相置换
             */
            int m = r.nextInt(max);
            int n = unordered[m];//记录随机下标的值
            unordered[m] = unordered[i];
            unordered[i] = n;
        }
        int index = 0;
        //用打乱后的一维数组有序赋值给二维数组
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                puzzle[i][j] = unordered[index];
                index++;
            }
        }
        show();
    }

    //二维数组的遍历
    public void show() {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                System.out.print(puzzle[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //检验二维数组是否达到预期要求
    public static boolean checkout(){
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle.length; j++) {
                if (puzzle[i][j] != key[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    public void waigua() {
        puzzle = key;
    }
}
