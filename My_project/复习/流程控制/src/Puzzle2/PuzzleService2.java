package Puzzle2;

import java.util.Random;
import java.util.Scanner;

public class PuzzleService2 {

    // 难度
    private int level;
    // 标准答案
    private int[][] puzzle;
    // 临时数组
    private int[][] tempPuzzle;
    // 空白位置的下标
    private int[] zeroIndex;

    // 开始时间
    private long startTime;
    // 结束时间
    private long endTime;
    // 步数
    private int step;

    // 保存回放的三维数组
    private int[][][] savePuzzle = new int[0][level][level];

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PuzzleService2(int level) {
        this.level = level;
    }

    public PuzzleService2() {
    }

    // 初始化要展示给用户的拼图
    public void initPuzzle(){
        int[] arr = initArray();
        puzzle = oneToTwo(arr);
        tempPuzzle = oneToTwo(arr);
        zeroIndex = findZeroIndex();
        shuffleArray();
        show();
    }

    // 二维数组的打乱
    public void shuffleArray(){
        Random r = new Random();
        for(int i = 1;i <= level * level * level * level;i++){
            int num = r.nextInt(4);
            switch (num){
                case 0:
                    moveUp();
                    break;
                case 1:
                    moveDown();
                    break;
                case 2:
                    moveLeft();
                    break;
                case 3:
                    moveRight();
                    break;
            }
        }
    }

    // 展示标准答案和临时数组
    public void show(){
        /*System.out.println("---答案---");
        showPuzzle(puzzle);
        System.out.println("---当前拼图---");*/
        showPuzzle(tempPuzzle);
    }

    // 根据难度初始化一维数组
    public int[] initArray(){
        int[] arr = new int[level * level];
        for(int i = 0 ;i < arr.length - 1;i++){
            arr[i] = i + 1;
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

    // 一维数组转换成二维数组
    public int[][] oneToTwo(int[] arr){
        int[][] t = new int[level][level];
        for(int i = 0 ;i <= arr.length - 1;i++){
            t[i / level][i % level] = arr[i];
        }
        return t;
    }

    // 打乱一维数组
    public void shuffleArray(int[] arr){
        Random r = new Random();
        for(int i = 1;i <= level * level; i++){
            int i1 = r.nextInt(arr.length);
            int i2 = r.nextInt(arr.length);
            int t = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = t;
        }
    }

    // 展示拼图
    public void showPuzzle(int[][] arr){
        for(int i = 0 ;i <= arr.length - 1;i++){
            for(int j = 0;j<=arr[i].length - 1;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    // 移动
    public void play(){
        Scanner sc = new Scanner(System.in);
        startTime = System.currentTimeMillis();
        for(;;){
            System.out.println("请输入：w.上移 s.下移 a.左移 d.右移");
            String str = sc.next();
            switch (str){
                case "w":
                    moveUp("无法上移");
                    break;
                case "s":
                    moveDown("无法下移");
                    break;
                case "a":
                    moveLeft("无法左移");
                    break;
                case "d":
                    moveRight("无法右移");
                    break;
                case "x":
                    oneKeySuccess();
                    break;
            }
            saveTempPuzzle();
            step++;
            show();
            if(isSuccess()){
                System.out.println("恭喜您，完成拼图");
                System.out.println("是否查看回放：1.看 2.不看");
                int num = sc.nextInt();
                if(num == 2){
                }else if(num == 1){
                    showRecode();
                }
                break;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
        System.out.println("步数："+step);
    }

    // 找零（找空白）
    public int[] findZeroIndex(){
        int[] arr = new int[2];
        for(int i = 0 ;i <= tempPuzzle.length - 1;i++) {
            for (int j = 0; j <= tempPuzzle[i].length - 1; j++) {
                if(tempPuzzle[i][j] == 0){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    // 上移
    public void moveUp(String msg){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(x == level - 1){
            System.out.println(msg);
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x + 1][y];
        tempPuzzle[x + 1][y] = t;
        zeroIndex[0]++;
    }

    // 上移
    public void moveUp(){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(x == level - 1){
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x + 1][y];
        tempPuzzle[x + 1][y] = t;
        zeroIndex[0]++;
    }

    // 下移
    public void moveDown(String msg){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(x == 0){
            System.out.println(msg);
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x - 1][y];
        tempPuzzle[x - 1][y] = t;
        zeroIndex[0]--;
    }

    // 下移
    public void moveDown(){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(x == 0){
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x - 1][y];
        tempPuzzle[x - 1][y] = t;
        zeroIndex[0]--;
    }

    // 左移
    public void moveLeft(String msg){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(y == level - 1){
            System.out.println(msg);
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x][y + 1];
        tempPuzzle[x][y + 1] = t;
        zeroIndex[1]++;
    }

    // 左移
    public void moveLeft(){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(y == level - 1){
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x][y + 1];
        tempPuzzle[x][y + 1] = t;
        zeroIndex[1]++;
    }

    // 右移
    public void moveRight(String msg){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(y == 0){
            System.out.println(msg);
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x][y - 1];
        tempPuzzle[x][y - 1] = t;
        zeroIndex[1]--;
    }

    // 右移
    public void moveRight(){
        int x = zeroIndex[0];
        int y = zeroIndex[1];
        if(y == 0){
            return;
        }
        int t = tempPuzzle[x][y];
        tempPuzzle[x][y] = tempPuzzle[x][y - 1];
        tempPuzzle[x][y - 1] = t;
        zeroIndex[1]--;
    }

    // 判断拼图是否完成
    public boolean isSuccess(){
        for(int i = 0 ;i <= tempPuzzle.length - 1;i++) {
            for (int j = 0; j <= tempPuzzle[i].length - 1; j++) {
                if(puzzle[i][j] != tempPuzzle[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    // 一键成功
    public void oneKeySuccess(){
        tempPuzzle = puzzle;
    }

    // 保存临时数组
    public void saveTempPuzzle(){
        int[][][] arr = new int[savePuzzle.length + 1][level][level];
        for(int i = 0; i <= savePuzzle.length - 1;i++){
            arr[i] = savePuzzle[i];
        }
        int[][] t = new int[level][level];
        copyArray(t);
        arr[arr.length - 1] = t;
        savePuzzle = arr;
    }

    // 回放功能（遍历三维数组）
    public void showRecode(){
        for(int i = 0 ;i <= savePuzzle.length - 1;i++){
            int[][] t = savePuzzle[i];
            System.out.println("---第"+(i+1)+"步---");
            showPuzzle(t);
           /* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    // 复制二维数组中的元素
    public void copyArray(int[][] t){
        for(int i = 0;i <= tempPuzzle.length - 1;i++){
            for(int j = 0 ; j <= tempPuzzle[i].length - 1;j++){
                t[i][j] = tempPuzzle[i][j];
            }
        }
    }
}

