package test;

import dao.Author;
import utils.GetAuthors;

import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        //如果获取到的 optionalAuthor 为null，get方法会报错
        /*optionalAuthor = null;
        Author author1 = optionalAuthor.get();*/
        Optional<Author> optionalAuthor = GetAuthors.getAuthor();
        Author author = optionalAuthor.orElseGet(() -> new Author());
        System.out.println(author);
    }
}
