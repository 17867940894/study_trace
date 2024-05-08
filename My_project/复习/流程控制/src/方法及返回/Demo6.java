package 方法及返回;

/*
定义方法判断两个二维数组中的元素是否完全相同
 */
public class Demo6 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {6, 5, 4, 7, 8},
                {9, 8, 7, 2, 3}
        };
        int[][] b = {
                {1, 2, 3, 4, 5, 6},
                {6, 5, 4, 7, 8},
                {9, 8, 7, 2, 3}
        };
        say(a, b);
    }

    public static void say(int[][] a, int[][] b) {
        boolean B = true;
        if (a.length != b.length) {
            B = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i].length != b[i].length) {
                    B = false;
                    break;
                }
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]) {
                        B = false;
                    }
                }
            }
        }
        if (B) {
            System.out.println("这两个数组完全相同");
        } else {
            System.out.println("这两个数组不相同");
        }
    }
}
