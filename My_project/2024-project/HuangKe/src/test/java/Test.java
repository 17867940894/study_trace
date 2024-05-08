import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "insertintofruits(f_id,s_id,f_name,f_price)values\n" +
                "('al',101,'apple',5.2),\n" +
                "('bl',101,'blackberry',10.2),\n" +
                "('bsl',102,'orange',11.2),\n" +
                "('bs2',105,'rnelon',8.2),\n" +
                "('tl',102,'banana',10.3),\n" +
                "('t2',102,'grape',5.3),\n" +
                "('02',103,'coconut',9.2),\n" +
                "('c0',101,'cherry',3.2),\n" +
                "('a2',103,'apricot',2.2),\n" +
                "('12',104,'lemon',6.4),\n" +
                "('b2',104,'berry',7.6),\n" +
                "('m1',106,'mango',15.7),\n" +
                "('m2',105,'xbabay',2.6),\n" +
                "('t4',107,'xbababa',3.6),\n" +
                "('m3',105,'xxtt',11.6),\n" +
                "('b5',107,'xxxx',3.6);";
        s = s.replace(" ", "");
        System.out.println(s);
    }


}
