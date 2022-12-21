package lab09.Task2;

public class Student {
    public int getGPA() {
        return GPA;
    }

    private int GPA;

    public Student(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return Integer.toString(GPA);
    }

}
