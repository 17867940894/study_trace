package reduce;

import dao.Author;
import utils.GetAuthors;

import java.util.List;
import java.util.Optional;

public class Demo17 {
    /**
      boolean foundAny = false;
      T result = null;
      for (T element : this stream) {
       if (!foundAny) {
           foundAny = true;
           result = element;
       }else{
            result = accumulator.apply(result, element);
       }
      }
      return foundAny ? Optional.of(result) : Optional.empty();
     */
    public static void main(String[] args) {
        //todo 获取作家年龄最小的
        List<Author> authors = GetAuthors.getAuthors();
        Optional<Integer> reduce = authors.stream()
                .map(author -> author.getAge())
                .reduce((result, element) -> result > element ? element : result);
        System.out.println(reduce);
    }
}
