package 接口.Work;

public class Computer {
    public void open(){
        System.out.println("电脑开机");
    }

    public void connect(USB U){
        U.connect();
    }

}
