package test;


import bean.Emp;
import dao.EmpDao;
import service.EmpService;

import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        EmpDao dao = new EmpDao();
        EmpService service = new EmpService(dao);
        System.out.println("1.注册 2.查询信息");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("1")){
            Emp emp = new Emp(null, "大撒把", "t", new Date(), 12000.0, 7);
            boolean register = service.register(emp);
            if (register)
                System.out.println("注册成功");
            else
                System.out.println("程序出小差了");
        }else{
            String name = "周自强";
            int id = 25;
            Emp emp = service.queryEmp(id, name);
            if (emp != null){
                System.out.println(emp);
            }else {
                System.out.println("查无此人");
            }
        }
    }

}
