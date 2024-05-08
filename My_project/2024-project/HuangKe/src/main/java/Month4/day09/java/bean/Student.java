package Month4.day09.java.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;
    public void show(){
        System.out.println("--------------");
    }
}
