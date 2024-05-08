package myAnnotation;

public class Demo1 {
    public static void main(String[] args) {
        show();
    }

    @Deprecated(since = "8")
    @MyAnnotation
    public static void show() {
    }
}

class Test{
    public static void main(String[] args) {
        Demo1.show();
    }
}