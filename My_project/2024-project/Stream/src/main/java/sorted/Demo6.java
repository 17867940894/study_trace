package sorted;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo6 {
    public static void main(String[] args) {
        /**
         * 对流中的内容进行排序
         */
        List<Author> authors = GetAuthors.getAuthors();

        //空参方法 升序排列
        authors.stream()
                .sorted()
                .forEach(author -> System.out.println(author));
        System.out.println();
        //接口方法 降序排列
        authors.stream()
                .sorted((Author author_1 , Author author_2) -> author_2.getAge() - author_1.getAge())
                .forEach(author -> System.out.println(author));

    }
}
