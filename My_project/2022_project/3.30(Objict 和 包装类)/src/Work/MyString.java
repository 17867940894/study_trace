package Work;

public class MyString {

    private String myChar;

    @Override
    public String toString() {
        return "MyString{" +
                "myChar='" + myChar + '\'' +
                '}';
    }

    public String getMyChar() {
        return myChar;
    }

    public void setMyChar(String myChar) {
        this.myChar = myChar;
    }

    public MyString() {
    }

    public MyString(String myChar) {
        this.myChar = myChar;
    }
}
