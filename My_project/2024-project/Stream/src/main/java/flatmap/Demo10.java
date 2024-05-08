package flatmap;

import dao.Author;
import utils.GetAuthors;

import java.util.Arrays;
import java.util.List;

public class Demo10 {
    public static void main(String[] args) {
        /**
         * 打印所有书籍的分类且去重
         */
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                //获取集合的流
                .flatMap(author -> author.getBooks().stream())
                //给书籍去重
                .distinct()
                //获取书名分类的流
                .flatMap(book -> Arrays.stream(book.getCategory().split(",")))
                //给分类去重
                .distinct()
                .forEach(System.out::println);
    }
}
