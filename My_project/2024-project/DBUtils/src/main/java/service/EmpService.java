package service;

import bean.Emp;
import dao.EmpDao;

import java.sql.SQLException;

public class EmpService {

    EmpDao dao = new EmpDao();

    public EmpService(EmpDao dao) throws Exception {
        this.dao = dao;
    }

    public boolean register(Emp emp){
        boolean b = dao.register(emp);
        if (b){
            return b;
        }
        return false;
    }

    public Emp queryEmp(int id, String name){
        Emp emp = dao.queryEmp(id, name);
        if (emp != null){
            return emp;
        }
        return null;

    }
}
