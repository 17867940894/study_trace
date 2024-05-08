package test;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo19 {
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();
        StringBuilder str = new StringBuilder();
        authors.stream()
                .map(Author::getName)
                .forEach(str::append);
    }
}
