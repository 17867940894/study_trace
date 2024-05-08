package Demo1;

public class Demo1 {
    String s ;

    public Demo1(){
        System.out.println("无参构造函数");
    }

    public Demo1(String s){
        System.out.println(this);
        this.s = s;
    }

}
