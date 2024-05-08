import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        //TODO 查询员工名字带n的姓名，工资和邮箱

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
        String str = "SELECT last_name , salary , email FROM employees WHERE last_name like ?";
        PreparedStatement p = con.prepareStatement(str);
        p.setString(1,"%n%");
        ResultSet res = p.executeQuery();
        while(res.next()){
            String name = res.getString("last_name");
            double salary = res.getDouble("salary");
            String email = res.getString("email");
            System.out.println(name + "\t" + salary + "\t" + email);
        }
        res.close();
        p.close();
        con.close();
    }
}
