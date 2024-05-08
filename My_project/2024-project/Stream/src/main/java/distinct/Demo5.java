package distinct;

import dao.Author;
import utils.GetAuthors;

import java.util.List;
import java.util.stream.Stream;

public class Demo5 {
    /**
     * 打印所有作家的名字，不允许有重复
     * @param args
     */
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();
        GetAuthors.show(authors.stream());
        System.out.println();
        GetAuthors.show(authors.stream().distinct());
    }
}
