package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode//用于后期去重
public class Book {
    private Long id;
    private String name;
    //分类
    private String category;
    //评分
    private Integer score;
    //简介
    private String intro;
}
