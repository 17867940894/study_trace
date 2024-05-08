package dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Integer score;

    public int compareStudentByName(Student student) {
        return 0;
    }
}
