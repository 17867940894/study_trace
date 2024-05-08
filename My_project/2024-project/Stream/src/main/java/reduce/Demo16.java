package reduce;

import dao.Author;
import utils.GetAuthors;

import java.util.List;
import java.util.Optional;

public class Demo16 {
    public static void main(String[] args) {
        /**
         *
         T result = identity;
         for (T element : this stream)
         *result = accumulator.apply(result, element)
                * return result;
         * 计算年龄总和
         */
        List<Author> authors = GetAuthors.getAuthors();
        Optional<Integer> reduce = authors.stream()
                .map(author -> author.getAge())
                .reduce((age1, age2) -> age1 + age2);
        System.out.println(reduce);
    }
}
