package test;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo18 {
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                .map(author -> author.getAge())
                .map(String::valueOf);
    }
}
