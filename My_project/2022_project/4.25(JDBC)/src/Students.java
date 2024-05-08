public class Students {
    private String username;
    private String possWord;

    @Override
    public String toString() {
        return "Students{" +
                "username='" + username + '\'' +
                ", possWord='" + possWord + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPossWord() {
        return possWord;
    }

    public void setPossWord(String possWord) {
        this.possWord = possWord;
    }

    public Students() {
    }

    public Students(String username, String possWord) {
        this.username = username;
        this.possWord = possWord;
    }
}
