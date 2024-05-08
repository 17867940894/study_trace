public class text {
    public static void main(String[] args) {
        show(new A());
    }

    public static void show(C cc){
        if (cc instanceof A){
            A F = (A)cc;
        }
        if (cc instanceof B) {
            B b = (B) cc;
        }
    }
}
class A extends C{
    public void show(){
        System.out.println("a");
    }
}
class  B extends C{
    public void show(){
        System.out.println("b");
    }
}
class C{

}