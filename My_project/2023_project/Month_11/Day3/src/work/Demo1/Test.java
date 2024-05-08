package work.Demo1;

public class Test {
    public static void main(String[] args) {
        Zi[] arr = new Zi[2];
        Zi zi_1 = new Zi();
        zi_1.setAge(30);
        zi_1.setName("王五");
        Zi zi_2 = new Zi("张三", 20);
        arr[0] = zi_1;
        arr[1] = zi_2;
        show(arr);
    }

    private static void show(Zi[] arr) {
        for (Zi z : arr) {
            System.out.println(z.toString());
        }
    }
}
