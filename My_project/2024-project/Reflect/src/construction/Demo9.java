package construction;

public class Demo9 {

    public static void main(String[] args) throws Exception{

        Class stringClass = Class.forName("java.lang.String");
        //获取该类的父类
        Class superclass = stringClass.getSuperclass();
        System.out.println(superclass.getSimpleName());
        //获取该类实现的接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class Interface : interfaces) {
            System.out.println(Interface.getSimpleName());
        }
    }

}
