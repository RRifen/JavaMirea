package lab02.Task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return "{Name: " + this.name + "; email: " + this.email + "; gender: " + this.gender + "}";
    }
}