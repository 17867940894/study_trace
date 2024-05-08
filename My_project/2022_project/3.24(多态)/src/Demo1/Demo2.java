package Demo1;

public class Demo2 {
    public static void main(String[] args) {
        new F().Show();//TODO 实现接口的抽象类也可以直接调用接口中的非抽象方法
        /*new A2() {
            @Override
            public void show() {
                //TODO 重写功能
            }
        }.Show();//TODO 接口中的非抽象方法不用重写也可调用*/

    }
}

interface A2{
    static void f(){
        //TODO 接口中的静态方法只能由接口名调用，它的实现类无法调用
    }
    void show();
    default void Show(){
        System.out.println("接口中的非抽象方法");
    }
}

class B2{
    public void Show(){
        System.out.println("B的普通方法");
    }
}
class F extends B2 implements A2{

    private void a(){
        System.out.println(666);
    }

    @Override
    public void show() {
        //TODO 接口的实现类可以不实现接口的非抽象方法
    }
}
