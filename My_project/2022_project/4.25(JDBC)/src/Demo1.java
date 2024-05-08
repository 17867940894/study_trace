import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo1 {
    static {

    }

    public static void main(String[] args) throws Exception {
        //TODO 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //TODO 获取连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/0425","root","root");
        //TODO 编写SQL语句
        String str = "insert into stu values(?,?,?)";
        //TODO 获取执行对象
        PreparedStatement ps = con.prepareStatement(str);
        //TODO 为占位符添加数据
        ps.setInt(1 , 2);
        ps.setString(2 , "张三");
        ps.setString(3 , "男");
        //TODO 执行sql，并接受返回的结果
        int row = ps.executeUpdate();
        //TODO 处理返回的结果
        System.out.println(row);
        //TODO 释放资源
        con.close();
        ps.close();
    }
}
