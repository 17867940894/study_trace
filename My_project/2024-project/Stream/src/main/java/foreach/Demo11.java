package foreach;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo11 {
    public static void main(String[] args) {
        //输出所有作家的名字
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                .map(author -> author.getName())
                .distinct()
                .forEach(System.out::println);
    }
}
