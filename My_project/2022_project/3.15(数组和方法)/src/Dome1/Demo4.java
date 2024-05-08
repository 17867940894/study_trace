package Dome1;

public class Demo4 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {7, 8, 9, 10}
        };
        for(int[] i : a){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
