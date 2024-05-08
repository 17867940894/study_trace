package work;

public class Demo1 {
    /**
     * 定义两个类，子类和父类，父类属性私有化，思考如何在创建子类对象时，对这些共性的私有化属性赋值
     */
    public static void main(String[] args) {
        Zi zi = new Zi("张三"  , 18 , 180 , "黄冈科技职业学院" );
        zi.show();
    }
}
