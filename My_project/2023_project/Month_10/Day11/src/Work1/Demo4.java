package Work1;

public class Demo4 {
    /**
     * 返回成绩数组的平均分
     * @param args
     */
    public static void main(String[] args) {
        double[] score = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(GPA(score));
    }

    private static double GPA(double[] score) {
        double gpa = 0;
        for(double i : score){
            gpa += i;
        }
        return gpa/score.length;
    }
}
