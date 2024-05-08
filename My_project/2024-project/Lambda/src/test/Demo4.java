package test;

import java.util.function.Function;

public class Demo4 {
    public static void main(String[] args) {
        Integer integer1 = typeConver(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });
        System.out.println(integer1);

        //lambda写法
        Integer integer2 = typeConver((s) -> Integer.valueOf(s));
        System.out.println(integer2);
    }

    public static <R> R typeConver(Function<String , R> function){
        String str = "1234";
        R result = function.apply(str);
        return  result;
    }
}
