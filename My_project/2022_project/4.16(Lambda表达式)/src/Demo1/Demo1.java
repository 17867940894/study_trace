package Demo1;

/*
Lambda表达式的使用前提：
1. 必须要有一个方法，这个方法的参数中要有一个接口
2. 这个接口必须是一个函数式接口（函数式接口：有且只有一个抽象方法的接口）
注：使用`@FunctionalInterface`注解可以校验该接口是否是一个函数式接口
语法格式：()->{};
 */

public class Demo1 {

    static Demo1 demo1 = new Demo1();

    public static void main(String[] args) {
        Human h1 = (name) -> System.out.println(name + "说:就这?");
        h1.eat("好大儿");
    }
}

interface Human {
    void eat(String name);
}