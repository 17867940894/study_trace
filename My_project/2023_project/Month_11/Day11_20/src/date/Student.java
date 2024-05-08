package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student implements Comparable<Student>{

    String name;
    Date age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, Date age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        //升序
        Date thisDate = this.getAge();
        Date studentDate = student.getAge();
        Calendar thisCalendar = Calendar.getInstance();
        Calendar studentCalendar = Calendar.getInstance();
        thisCalendar.set(thisDate.getYear() , thisDate.getMonth() + 1 , thisDate.getDate());
        studentCalendar.set(studentDate.getYear() , studentDate.getMonth() + 1 , studentDate.getDate());
        if (thisCalendar.get(Calendar.YEAR) != studentCalendar.get(Calendar.YEAR))
            return thisCalendar.get(Calendar.YEAR) -studentCalendar.get(Calendar.YEAR);
        if (thisCalendar.get(Calendar.MONTH) != studentCalendar.get(Calendar.MONTH))
            return thisCalendar.get(Calendar.MONTH) - studentCalendar.get(Calendar.MONTH);
        return thisCalendar.get(Calendar.DAY_OF_MONTH) - studentCalendar.get(Calendar.DAY_OF_MONTH);
    }



    /*//用Date实现
    @Override
    public int compareTo(Student student) {
        //升序
        Date thisDate = this.getAge();
        Date studentDate = student.getAge();
        if (thisDate.getYear() == studentDate.getYear()){
            if (thisDate.getMonth() == studentDate.getMonth()){
                return thisDate.getDate() - studentDate.getDate();
            }
            return thisDate.getMonth() - studentDate.getMonth();
        }
        return thisDate.getYear() - studentDate.getYear();
    }*/
}
