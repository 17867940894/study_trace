package Demo2;

public class Demo1 {
    public static void main(String[] args) {
        int i = 0;
        for (; ; ) {
            if (i == 10) {
                break;
            }
            i++;
            System.out.println(i);
        }
        while(true){
            if (i == 20) {
                break;
            }
            i++;
            System.out.println(i + "*********");
        }
        do {
            i++;
            System.out.println(i);
        }while (i != 30);
    }
}
