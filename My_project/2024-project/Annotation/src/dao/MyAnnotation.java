package dao;

@myAnnotation.MyAnnotation
public class MyAnnotation {

    @myAnnotation.MyAnnotation
    @Deprecated
    public void show(){
        System.out.println("MyAnnotation的过期show方法执行了" );

    }
}
