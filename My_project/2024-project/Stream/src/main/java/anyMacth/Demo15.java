package anyMacth;

import dao.Author;
import utils.GetAuthors;

import java.util.List;

public class Demo15 {
    public static void main(String[] args) {
        /**
         * 判断作家中是否有年龄超过指定岁数的人
         */
        List<Author> authors = GetAuthors.getAuthors();
        //有一个符合返回true
        boolean b = authors.stream()
                .anyMatch(author -> author.getAge() > 25);
        //所有符合返回true
        boolean bb = authors.stream()
                .allMatch(author -> author.getAge() > 25);
        //所有都不符合条件返回true
        boolean bbb = authors.stream()
                .noneMatch(author -> author.getAge() < 14);
        System.out.println(b);
        System.out.println(bb);
        System.out.println(bbb);
    }
}
