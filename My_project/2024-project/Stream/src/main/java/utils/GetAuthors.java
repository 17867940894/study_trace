package utils;

import dao.Author;
import dao.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GetAuthors {

    //通过泛型方式遍历，提高代码复用性
    public static <T> void show(Stream<T> t) {
        t.forEach(System.out::println);
    }

    public static List<Author> getAuthors() {
        //数据初始化
        Author author1 = new Author(1L, "蒙多", 33, "祖安人", null);
        Author author2 = new Author(2L, "亚索", 18, "E中人", null);
        Author author3 = new Author(3L, "易", 14, "高原血统", null);
        Author author4 = new Author(3L, "易", 14, "高原血统", null);
        //书籍列表
        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        books1.add(new Book(1L , "光明与黑暗" , "哲学,爱情" , 88 , "一道划分了爱恨"));
        books1.add(new Book(2L , "不能在同一棵树上吊死" , "个人成长" , 99 , "失败中明悟"));

        books2.add(new Book(3L , "风吹不到的地方" , "哲学,数学" , 85 , "世界尽头"));
        books2.add(new Book(3L , "风吹不到的地方" , "哲学,数学" , 85 , "世界尽头"));
        books2.add(new Book(4L , "吹或不吹" , "个人传记" , 56 , "被误解是表达着的宿命"));

        books3.add(new Book(5L , "你的剑就是我的剑" , "爱情" , 56 , "宽容"));
        books3.add(new Book(6L , "风与剑" , "个人传记" , 100 , "灵魂的碰撞"));
        books3.add(new Book(6L , "风与剑" , "个人传记" , 100 , "灵魂的碰撞"));

        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);
        author4.setBooks(books3);

        List<Author> authorList = new ArrayList<>(Arrays.asList(author1,author2,author3,author4));

        return authorList;
    }
}
