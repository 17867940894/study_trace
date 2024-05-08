package skip;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo8 {
    public static void main(String[] args) {
        /**
         * 打印除了年纪最大的作家以外的所有作家，且按年龄降序排列
         */
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                .sorted((author_1 , author_2) -> author_2.getAge() - author_1.getAge())
                .distinct()
                .skip(1)
                .forEach(author -> System.out.println(author));
    }
}
