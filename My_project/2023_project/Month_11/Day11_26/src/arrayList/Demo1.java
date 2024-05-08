package arrayList;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("a" );
        arrayList1.add("b" );
        arrayList1.add("c" );
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("a" );
        arrayList2.add("b" );
        arrayList2.add("c" );
        arrayList2.add("d" );
        System.out.println(arrayList1);
        System.out.println(arrayList2);
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList2.remove("a");
        System.out.println(arrayList2);
    }
}
