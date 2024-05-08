package exercise;

public class Demo11_user {
    private String userName;
    private String pow;

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                ", pow='" + pow + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPow() {
        return pow;
    }

    public void setPow(String pow) {
        this.pow = pow;
    }

    public Demo11_user() {
    }

    public Demo11_user(String userName, String pow) {
        this.userName = userName;
        this.pow = pow;
    }
}
