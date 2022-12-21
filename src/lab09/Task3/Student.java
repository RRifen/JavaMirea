package lab09.Task3;

public class Student implements Comparable<Student>{
    private int IDNumber;

    public Student(int idNumber) {
        IDNumber = idNumber;
    }

    @Override
    public int compareTo(Student o) {
        if (IDNumber < o.IDNumber) {
            return -1;
        }
        if (IDNumber > o.IDNumber) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return Integer.toString(IDNumber);
    }

}
