package flatmap;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo9 {
    public static void main(String[] args) {
        /**
         * 打印所有书籍的名字，且对重复的元素去重
         */
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                //将author的books集合变为Stream流对象
                .flatMap((author -> author.getBooks().stream()))
                //去重
                .distinct()
                .map(book -> book.getName())
                .forEach(System.out::println);
    }
}
