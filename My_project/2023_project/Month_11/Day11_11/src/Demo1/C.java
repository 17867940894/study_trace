package Demo1;

public interface C {

    public default void show(){
        System.out.println("C接口中的普通方法执行了");
    }

}
