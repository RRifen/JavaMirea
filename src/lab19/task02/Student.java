package lab19.task02;

public class Student implements Comparable<Student> {
    public double getGPA() {
        return GPA;
    }

    private double GPA;

    public String getFIO() {
        return FIO;
    }

    private String FIO;

    public Student(String FIO, double GPA) throws EmptyStringException {
        if (FIO.equals("")) {
            throw new EmptyStringException("Empty FIO");
        }
        this.FIO = FIO;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "{FIO: " + FIO + "\nGPA: " + Double.toString(GPA) + "}";
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(GPA, o.GPA);
    }
}
