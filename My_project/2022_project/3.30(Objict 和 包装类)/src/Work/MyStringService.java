package Work;

public class MyStringService {

    public void show(String s ){
        MyString[] myString = new MyString[variety(s)];
        add(myString,s);
        for (MyString my : myString)
            System.out.println(my);
    }

    //字符串种类
    private int variety(String s ){
        int index = 0;
        for (;;){
            String first = s.charAt(0) + "";
            s = s.replaceAll(first,"");
            if (s.equals(""))
                break;
            ++index;
        }
        return index;
    }

    //给每个对象属性赋值
    private void add(MyString[] myStrings , String s ){
        int n = s.length();
        for (int i = 0; i < n; i++) {
            String first = s.charAt(0) + "";
            myStrings[i] = new MyString(first);
            for (int j = 1; j < s.length(); j++) {
                if (first.equals(s.charAt(i) + ""))
                    myStrings[i].setMyChar(myStrings[i].getMyChar() + first);
            }
            System.out.println(myStrings[i]);
            s = s.replaceAll(first,"");
        }
    }


}

