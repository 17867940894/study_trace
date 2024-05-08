public class Demo3 {
    /*
    3.给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     */
    public static void main(String[] args) {
        String s = "wacuipcjcal";
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        int res = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index]);
            System.out.println(start + "\t" + index + "\t" + last[index]);
            //System.out.println(res + "\t" +(i - start + 1));
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }
        System.out.println(res);
    }
}
