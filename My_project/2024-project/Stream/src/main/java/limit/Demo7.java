package limit;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo7 {
    public static void main(String[] args) {
        /**
         * 对流中的元素按年龄降序排列，且不能有重复的元素，然后打印其中两个年龄最大的作家
         */
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                .sorted((author_1 , author_2) -> author_2.getAge() - author_1.getAge())
                .distinct()
                .limit(2)
                .forEach(author -> System.out.println(author.getName()));
    }
}
