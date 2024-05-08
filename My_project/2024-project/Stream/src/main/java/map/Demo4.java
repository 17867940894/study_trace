package map;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo4 {
    /**
     * map中间件
     */
    public static void main(String[] args) {
        List<Author> authors = GetAuthors.getAuthors();
        authors.stream()
                .map(author -> author.getAge())
                //给所有作家的年龄进行加减,不会对原数据进行修改
                .map(age -> age + 10)
                .forEach(System.out::println);
        //验证原数据是否被修改
        GetAuthors.show(authors.stream());

        System.out.println();

        //打印所有作家名字
        authors.stream()
                .map(author -> author.getName())
                .forEach(System.out::println);
    }

}
