package test;

import dao.Author;
import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {
        Author author1 = getAuthor();
//        此方法的使用，必须保证参数不为空
//        Optional<Author> author11 = Optional.of(author1);
        //此方法不受参数为null值影响
        Optional<Author> optionalAuthor = Optional.ofNullable(author1);
        optionalAuthor.ifPresent(author2 -> System.out.println(author2.getName()));
    }

    private static Author getAuthor() {
        return new Author(1L, "蒙多", 33, "祖安人", null);
    }
}
