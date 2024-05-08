package Demo2.Demo2;

import java.util.Comparator;

public class student implements Comparator<student> {
        private String name;
        private int age;
        private int score;

        public student(String name, int age, int score) {
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

        public student() {
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
    public int compare(student o1, student o2) {
        //return o1.age == o2.age?o1.score - o2.score:o1.age - o2.age;//TODO 年龄升序,年龄相同，成绩升序
        //return o2.age == o1.age?o2.score - o1.score:o2.age - o1.age;//TODO 年龄降序,年龄相同，成绩降序
        //return o2.age == o1.age?o1.score - o2.score:o2.age - o1.age;//TODO 年龄降序,年龄相同，成绩升序
        return o2.age == o1.age?o1.score - o2.score:o1.age - o2.age;//TODO 年龄升序,年龄相同，成绩升序
    }
}



