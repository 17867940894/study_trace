package Work;
//找出人名数组中最长的人名和姓张的人
public class Demo3 {
    public static void main(String[] args) {
        String[] name = {"张三","李四","王五","赵六","张不三","李不四"};
        String max = "";
        int z = 0;
        System.out.print("姓张的人有:");
        for(String s : name){
            max = max.length() >= s.length()?max:s;
            if (s.startsWith("张"))
                System.out.print(s + " ");
        }
        System.out.println();
        System.out.print("名字最长的人是:");
        for(String s : name){
            if (s.length() == max.length())
                System.out.print(s + " ");
        }
    }
}
