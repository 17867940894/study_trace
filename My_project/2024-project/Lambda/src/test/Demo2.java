package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        //使用lambda遍历集合
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums,1,2,3,4,5,6,7);
//        nums.forEach((num) -> System.out.println(num));
        nums.forEach(System.out::println);


    }
}
