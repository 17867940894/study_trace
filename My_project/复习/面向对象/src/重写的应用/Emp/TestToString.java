package 重写的应用.Emp;

public class TestToString {
    public static void main(String[] args) {
        Emp e = new Emp();
        System.out.println(e);
        Emp e2 = new Emp();
        System.out.println(e2);
        /*System.out.println(e.toString());
        System.out.println(e.getClass().getName());
        System.out.println(e.hashCode());//1239731077
        System.out.println(Integer.toHexString(1239731077));*/
        System.out.println(e.getClass().getName() + "@" + Integer.toHexString(e.hashCode()));
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
