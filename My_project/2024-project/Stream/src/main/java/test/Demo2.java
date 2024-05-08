package test;

import dao.Author;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Stream;

/**
 * 创建Stream流
 */
public class Demo2 {
    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        //方式一,集合创建
        Stream<Author> stream_1 = authors.stream();
        //双列集合先转单列集合
        Map<String , String> map = new HashMap();
        map.put("1" , "张三");
        map.put("2" , "李四");
        map.put("3" , "王五");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream = entries.stream();

        //方式二，数组创建
        Integer[] nums = {1,2,3,4,5,6};
        Stream<Integer> stream_2 = Arrays.stream(nums);

        //方式三,流创建
        Stream<Integer> stream_3 = Stream.of(nums);
        Stream<List<Author>> stream_4 = Stream.of(authors);
        //打印输出
        show(stream);
    }

    //通过泛型方式遍历，提高代码复用性
    private static <T> void show(Stream<T> t) {
        t.forEach(System.out::println);
    }

    //通过反射获取Demo1中的数据
    private static List<Author> getAuthors() {
        Object obj = null;
        try {
            Class c = Class.forName("test.Demo1");
            obj = c.newInstance();
            Method method = c.getDeclaredMethod("getAuthors",Object.class);
            method.setAccessible(true);
            obj = method.invoke(obj , new Object());
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Author> authors = (List<Author>)obj;
        return authors;
    }
}
