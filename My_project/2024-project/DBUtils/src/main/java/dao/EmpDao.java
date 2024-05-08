package dao;

import Util.DruidUtils;
import bean.Emp;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class EmpDao {

    QueryRunner qr = new QueryRunner(DruidUtils.getDateSources());

    public EmpDao() throws Exception {
    }

    public boolean register(Emp emp){
        String sql = "insert into testdatabase.emp values (null,?,?,?,?,?)";
        int updateNum = 0;
        try {
            updateNum = qr.update(sql, emp.getName(),emp.getSex(),emp.getHireTime(),emp.getSalary(),emp.getDeptId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return updateNum == 1;
    }

    public Emp queryEmp(int id, String name){
        String sql = "select eid id , ename name , sex , hire hireTime , sar salary , did deptId " +
                "from testdatabase.emp where eid = ? and ename = ?";
        Emp emp = null;
        try {
            emp = qr.query(sql, new BeanHandler<Emp>(Emp.class), id, name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return emp;
    }
}


