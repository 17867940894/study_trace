package Demo5;

public class Text {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("张三",30,8000);
        Teacher t2 = new Teacher("李四",20,12000);
        Teacher t3 = new Teacher("赵六",22,5000);

        Teacher[] teachers = {t1,t2,t3};

        for (Teacher teacher : teachers){
            teacher.show();
            /*System.out.println(teacher.name);
            System.out.println(teacher.age);
            System.out.println(teacher.score);*/
        }

        /*for (Teacher teacher : t)
            teacher.show();
            //System.out.println(teacher);
        System.out.println("======================");
        for( Teacher teacher : t2)
            teacher.show();
            //System.out.println(teacher);*/
    }
}
