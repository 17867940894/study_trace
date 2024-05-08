package Demo2;

public class Student implements Comparable<Student>{
        private String name;
        private int age;
        private int score;

        public Student(String name, int age, int score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public Student() {
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student s) {
            if (s.age == age)
                return s.score - this.score;//TODO 年龄升序,如果年龄相同,则成绩降序排列;
        return this.age - s.age;
    }
}



