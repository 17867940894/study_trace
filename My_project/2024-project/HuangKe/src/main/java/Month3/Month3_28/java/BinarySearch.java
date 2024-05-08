package Month3.Month3_28.java;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {15, 851, 8, 48, 0, 84, 9, -215, 1, 65, 48};
//        demo1(arr);
        demo2(arr, 84);
    }

    private static void demo2(int[] arr, int findTheNum) {
        demo1(arr);
        int index = (arr.length - 1) / 2;
        int first = 0 , end = arr.length - 1 ;
        while(Math.abs(first - end) != 0){
            /*try
            {
                Thread.sleep(1000);
                System.out.println("index:\t" + index );
                System.out.println(first + "    " + end + "    arr[index]=" + arr[index]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            if (findTheNum > arr[index]){
                first = index;
                //避免查找的值在两个极点 , 如(10-9)/2 = 0+index = index 出现死循环
                index = (end - index)/2 + index + 1;
            } else if (findTheNum < arr[index]) {
                end = index;
                index = (index - first)/2 + first;
            }else {
                System.out.println(findTheNum + "的下标为:" + index);
                return;
            }
        }
        System.out.println("查无此值！");
    }

    private static void demo1(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
