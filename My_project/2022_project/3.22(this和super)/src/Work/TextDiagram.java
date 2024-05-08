package Work;
//TODO 3.定义圆形类和方形类，定义它们各自的求周长和求面积的方式，将它们的共性内容提取到父类中
public class TextDiagram {
    public static void main(String[] args) {
        round r = new round();
        r.area(10);
        r.perimeter(10);
        square s = new square();
        s.area(10);
        s.perimeter(10);
    }
}
