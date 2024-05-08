package Dome1;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7,4,5,6,7},
                {7,8,9,10}
        };
        for(int[] i : a){
            System.out.println(Arrays.toString(i));
        }
    }
}
