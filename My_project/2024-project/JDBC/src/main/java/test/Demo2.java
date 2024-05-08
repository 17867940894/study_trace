package test;

import bean.Student;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        //编写sql语句
        String sql = "select * from testdatabase.student";
        //获取执行对象
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet resultSet = ps.executeQuery();
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(Integer.valueOf(resultSet.getString("s_id")));
            student.setName(resultSet.getString("s_name"));
            student.setSex(Integer.valueOf(resultSet.getString("s_sex")));
            students.add(student);
        }
        students.forEach(System.out::println);
        resultSet.close();
        connection.close();
    }
}
