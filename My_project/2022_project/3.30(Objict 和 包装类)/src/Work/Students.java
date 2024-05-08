package Work;

public class Students {
    private String name;
    private Integer age;


    //TODO 2.将一个学生对象存储到学生数组中，如果该学生对象的所有属性和数组中已存在的某个学生对象的所有属性全部相同，则不存储
    @Override  //TODO 比较的是对象数组的内容
    public boolean equals(Object obj) {
        if (!(obj instanceof Work.Students))
            return false;
        Work.Students s = (Work.Students) obj;
        if (this.name != s.name)
            return true;
        if (this.age != s.age) {
            return true;
        }
        return false;
    }


    //TODO 1.定义学生类的对象存储到集合中，使用重写的toString方法查看学生对象的所有属性
    @Override
    public String toString() {
        return "Students:   " +
                "姓名:  " + name + "\t\t" +
                "年龄:  " + age;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Students(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
