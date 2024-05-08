package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Integer id;
    private String name;
    private String sex;
    private Date hireTime;
    private Double salary;
    private Integer deptId;
}
