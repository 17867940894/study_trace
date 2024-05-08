package count;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo12 {
    public static void main(String[] args) {
        /**
         * 打印所有作家共撰写的作品总数
         */
        List<Author> authors = GetAuthors.getAuthors();
        System.out.println(authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .count());
    }
}
