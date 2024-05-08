package Work;

public class Demo4 {
    public static void main(String[] args) {
        double wh = 100;
        double sum = 0;
        int i = 0;
        /*for(int num = 0; num < 9; ++num) {
            sum += wh + wh / 2;
            wh /= 2;
        }*/
        while(++i < 10){
            sum += wh + wh / 2;
            wh /= 2;
        }
        System.out.println("10次弹起路程为：" + (sum + wh) + "\n" + "第十次弹起高度为：" + wh / 2.0D);
    }
}
