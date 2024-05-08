package Month3.Month3_29.java.work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        System.out.println("\n------------work1------------");
        homeWork1();
        System.out.println("\n------------work2------------");
        homeWork2();
        System.out.println("\n------------work3------------");
        homeWork3();
        System.out.println("\n------------work4------------");
        homeWork4();
        System.out.println("\n------------work5------------");
        homeWork5();

    }

    //TODO 矩阵相加
    private static void homeWork5() {
        int row = 3;
        //这里以长方形矩阵为例
        int[][] arr1 = new int[row][row*2];
        int[][] arr2 = new int[row][row*2];
        int[][] temp = new int[row][row*2];

        for (int i = 0; i < row; i++) {
            arr1[i] = fetchDontainer(row * 2);
            arr2[i] = fetchDontainer(row * 2);
        }

        System.out.println("arr1数组内容:");
        showArrays(arr1);
        System.out.println("arr2数组内容:");
        showArrays(arr2);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row*2; j++) {
                temp[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("temp数组内容:");
        showArrays(temp);
    }



    //TODO 删除数组中重复的数据
    private static void homeWork4() {
        int[] nums = {0, 0, 5, 7, 9, 13, 13, 14, 15, 17};
        int count = 0;//记录重复元素的个数
        Arrays.sort(nums);//升序排列数组
        for (int i = 0; i < nums.length - 1; i++) {
            //相邻元素相同进入循环
            if (nums[i] == nums[i+1]){
                //将其一赋值为最大元素
                nums[i] = nums[nums.length - 1];
                count++;
            }
        }
        Arrays.sort(nums);//再次排序
        System.out.println("原数组:" + Arrays.toString(nums));
        nums = Arrays.copyOf(nums, nums.length - count);//缩减长度，即可去除重复元素，即在多个最大元素中只留下一个最大元素
        System.out.println("去除重复元素后:" + Arrays.toString(nums));
    }

    //TODO 输入十个会员积分 冒泡排序
    private static void homeWork3() {
        int[] nums = fetchDontainer(10);
        System.out.println("排序前" + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0 , temp = 0; j < i; j++) {
                temp = nums[i];
                if (nums[i] < nums[j]){
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("排序后" + Arrays.toString(nums));
    }

    //TODO 无序填充值，倒序输出求平均值和最大元素下标
    private static void homeWork2() {
        int[] nums = fetchDontainer(8);
        int max = 0 , sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        System.out.println("倒序前:" + Arrays.toString(nums));
        System.out.print("倒序输出:");
        for (int i = nums.length - 1; i >= 0; i--)
            System.out.print(nums[i] + "\t");
        System.out.print("\n数组中的平均值为：" + sum/ nums.length);
        System.out.print("\n数组中的最大值下标为：");
        for (int i = 0; i < nums.length; i++)
            //防止数组中最大元素有多个
            if (nums[i] == max)
                System.out.print(i + " ");
    }

    //TODO 升序排列的数组插入数据后，仍旧升序
    private static void homeWork1() {
        int[] nums = fetchDontainer(10);
        System.out.println("插入数据前" + Arrays.toString(nums));
        int len = nums.length;
        System.out.println("请输入要插入的数字:");
        nums = Arrays.copyOf(nums,  len + 1);//数组长度扩容一
        nums[len] = sc.nextInt();
        Arrays.sort(nums);//排序
        System.out.println("插入后的数组" + Arrays.toString(nums));
    }

    //打印二维数组
    private static void showArrays(int[][] arr1) {
        for (int[] nums : arr1) {
            System.out.println(Arrays.toString(nums));
        }
    }

    //获取指定大小容器并在容器中随即赋予数据
    private static int[] fetchDontainer(int num) {
        int[] nums = new int[num];
        for (int i = 0; i < num; i++)
            nums[i] = r.nextInt(20);
        return nums;
    }

}
