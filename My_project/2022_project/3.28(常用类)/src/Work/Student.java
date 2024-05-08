package Work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthday;

    public Student(String name,int year,int month,int day) throws ParseException {
        this.name = name;
        this.birthday = new SimpleDateFormat("yyyy/MM/dd").parse(year + "/" + month + "/" + day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Student() {
    }

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
