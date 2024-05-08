package test;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo22 {
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                .mapToInt(author -> author.getAge() + 10)
                .filter(age -> age > 18)
                .map(age -> age + 2)
                .forEach(System.out::println);
    }
}
