package test;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo21 {
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                .map(Author::getName)
                .map(StringBuilder::new)
                .forEach(System.out::println);

        String s  = "456";
    }
}
