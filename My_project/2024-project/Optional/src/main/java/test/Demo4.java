package test;

import dao.Author;
import utils.GetAuthors;

import java.util.Optional;
import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        Optional<Author> optionalAuthor = GetAuthors.getAuthor();
        /**
         * filter(Predicate<? super T> predicate)
         * Predicate:函数式接口
         * 如果存在一个值，并且该值与给定的谓词匹配，则返回 可选 描述值，否则返回空 可选．
         */
        Optional<Author> author = optionalAuthor.filter(author1 -> author1.getAge() > 180);
        author.stream().forEach(System.out::println);
    }
}
