import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        //TODO 查询每个部门员工的人数以及部门名称，按员工人数降序排列

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
        String str = "SELECT d.department_id , COUNT(e.department_id) number FROM departments d LEFT JOIN employees e on d.department_id = e.department_id GROUP BY d.department_id ORDER BY number DESC , department_id ASC ";
        PreparedStatement p = con.prepareStatement(str);
        ResultSet res = p.executeQuery();
        while(res.next()){
            String name = res.getString("department_id");
            int id = res.getInt("number");
            System.out.println("部门:  " + name + "\t" + "人数:  " + id);
        }
    }
}
