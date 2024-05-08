package max_min;

import dao.Author;
import utils.GetAuthors;

import java.util.Comparator;
import java.util.List;

public class Demo13 {
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();
        System.out.println(authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .map(book -> book.getScore())
                .max((score1, score2) -> score1 - score2));

        System.out.println(authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .distinct()
                .map(book -> book.getScore())
                .min((score1, score2) -> score1 - score2));
    }
}
