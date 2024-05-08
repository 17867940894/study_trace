package Demo1;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~这是一个正经的石头剪刀布游戏~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.println("请决定玩家1出：1：石头  2：剪刀  3：布");
        int person1 = sc.nextInt();
        System.out.println("请决定玩家2出：1：石头  2：剪刀  3：布");
        int person2 = sc.nextInt();
        if (person1 == person2) {
            System.out.println("你们心有灵犀，这是个平局");
        } else if (person1 == 1 && person2 == 2 || person1 == 2 && person2 == 3 || person1 == 3 && person2 == 1) {
            System.out.println("玩家1获胜并给了玩家2一个脑瓜嘣");
        } else if ((person1 != 1 || person2 != 3) && (person1 != 2 || person2 != 1) && (person1 != 3 || person2 != 2)) {
            System.out.println("你输入个锤子，输123啊");
        } else {
            System.out.println("玩家2获胜并给了玩家1一个脑瓜嘣");
        }
    }
}
