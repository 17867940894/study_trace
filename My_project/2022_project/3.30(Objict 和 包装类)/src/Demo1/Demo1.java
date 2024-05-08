package Demo1;

public class Demo1 {
    String name;
    int age;

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1("张三",18);
        Demo1 demo2 = new Demo1("张三",17);
        System.out.println(demo1.equals(demo2));
        demo1 = demo2;
        System.out.println(demo1.equals(demo2));
    }


    @Override  //TODO 比较的是对象数组的内容
    public boolean equals(Object obj){
        if (obj == this)
            return true;
        if (!(obj instanceof Demo1))
            return false;
        Demo1 demo1 = (Demo1) obj;
        if (demo1.age != this.age)
            return false;
        if (this.name == null) {
            if (demo1.name == null)
                return true;
            return false;
        }else {
            if (!this.name.equals(demo1.name))//TODO 如果对象.属性是null的话，就不会有.equals（）方法，即会报错；
                return false;
        }
        return true;
    }

    public Demo1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Demo1() {
    }

}
