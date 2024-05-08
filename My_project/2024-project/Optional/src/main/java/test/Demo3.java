package test;

import dao.Author;
import utils.GetAuthors;

import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        Optional<Author> optionalAuthor = GetAuthors.getAuthor();
        /**
         * 无参数方法：
         * public T orElseThrow() {
         *         if (value == null) {
         *             throw new NoSuchElementException("No value present");
         *         }
         *         return value;
         *     }
         *      如果存在值，则返回该值，否则抛出 NoSuchElementException．
         *      如果存在值，则返回该值，否则抛出由异常提供函数产生的异常。
         *
         * 有参数方法：
         * public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
         *         if (value != null) {
         *             return value;
         *         } else {
         *             throw exceptionSupplier.get();
         *         }
         *     }
         * 如果存在值，则返回该值，否则抛出由异常提供函数产生的异常。
         * NullPointerException -如果没有值，异常提供函数为 零
         */
        Author author = optionalAuthor.orElseThrow();
        System.out.println(author);
    }
}
