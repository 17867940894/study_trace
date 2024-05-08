package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode//用于后期去重
public class Author implements Comparable<Author>{
    private Long id;
    private String name;
    private Integer age;
    //简介
    private String intro;
    //作品
    private List<Book> books;

    /**
     * 年龄按从小到大排序
     * @param o
     * @return
     */
    @Override
    public int compareTo(Author o) {
        return this.getAge() - o.getAge();
    }
}
