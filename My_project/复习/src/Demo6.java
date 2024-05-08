public class Demo6 {
    /*
    6. Z 字形变换
    将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
    比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
    P   A   H   N
    A P L S I I G       规律:你一个  我一个 他一个 我一个
    Y   I   R
     */
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        convert(s, 3);
    }

    public static void convert(String s, int numRows) {
        if (numRows == 1) {
            return;
        }
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        int loc = 0;
        boolean down = false;
        for (int i = 0; i < s.length(); i++) {
            rows[loc] += s.charAt(i);
            System.out.println(rows[loc]);
            if (loc == 0 || loc == numRows - 1)
                down = !down;
            loc += down ? 1 : -1;
        }
        for (String row : rows) {
            System.out.println(row);
        }
    }
}
