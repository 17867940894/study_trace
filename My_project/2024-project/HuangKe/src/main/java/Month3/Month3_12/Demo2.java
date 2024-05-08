package Month3.Month3_12;

public class Demo2 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 3;
        int day = 12;
        int sum = 0;
        switch (month) {
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                sum += year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? 29 : 28) : 29) : 28;
        }
        System.out.println(year + "年" + month + "月" + day + "日" + "是该年的第" + (sum + day) + "天");

    }
}
