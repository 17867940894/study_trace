package Work;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件路径:   ");
        String name = sc.next();
        for (; ; ) {
            service.Start(name);
            System.out.println("是否继续操作该文件夹？1.是 2.否 0.退出");
            int num = sc.nextInt();
            if (num == 0)
                break;
            if (num == 2) {
                System.out.println("请输入新的文件路径:  ");
                name = sc.next();
            }
        }
    }
}
