import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/0425","root","root");
        String str = "SELECT * FROM user";
        PreparedStatement p = con.prepareStatement(str);
        ResultSet res = p.executeQuery();
        Map<Integer, Students> map = new TreeMap<>();
        while (res.next()) {
            int id = res.getInt(1);
            String name = res.getString(2);
            String password = res.getString(3);
            map.put(id, new Students(name, password));
        }
        for (Map.Entry<Integer, Students> integer: map.entrySet()) {
            System.out.println(integer);
        }
    }
}
