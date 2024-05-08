package filter;

import dao.Author;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Stream;

/**
 * filter中间件
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Author> authors = getAuthors();
        authors.stream()
                //当名字长度>1的作业存在时，显示他的信息
                .filter(author -> author.getName().length() > 1)
                .forEach(System.out::println);
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
