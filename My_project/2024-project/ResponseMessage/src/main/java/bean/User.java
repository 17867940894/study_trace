package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
