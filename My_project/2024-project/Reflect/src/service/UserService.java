package service;

public class UserService {

    private boolean login(String name , String password){
        if ("admin".equals(name) && "123".equals(password))
            return true;
        return false;
    }

    public void logout(){
        System.out.println("程序已退出");
    }

    public void show(){
        System.out.println("show方法执行了");
    }
}
