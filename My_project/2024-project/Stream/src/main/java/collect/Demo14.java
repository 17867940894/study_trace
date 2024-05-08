package collect;

import dao.Author;
import dao.Book;
import utils.GetAuthors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo14 {
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();

        //List集合演示:获取所有作家名字
        authors.stream()
                .map(author -> author.getName())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        //Set集合演示:获取所有书名
        authors.stream()
                .flatMap(author -> author.getBooks().stream())
                .map(book -> book.getName())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //获取一个Map集合，map的key为作者名，value为List<Book>
        Map<String , List<Book> > map = authors.stream()
                .distinct()
                //有两个返回值，分别返回key和value
                .collect(Collectors.toMap(author -> author.getName() , author -> author.getBooks()));

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string + "的作品:");
            map.get(string).stream()
                    //给集合去重
                    .distinct()
                    .map(book -> book.getName())
                    .forEach(System.out::println);
            System.out.println();
        }

    }

}
