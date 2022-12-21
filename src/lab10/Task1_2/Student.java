package lab10.Task1_2;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    private String name;
    private String secondName;
    private String speciality;
    private int course;
    private String group;
    private double GPA;

    public Student(double GPA, String name, String secondName, String speciality, int course, String group) {
        this.GPA = GPA;
        this.name = name;
        this.secondName = secondName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "{GPA = " + GPA + "; " +
                "name = " + name + "; " +
                "secondName = " + secondName + "; " +
                "speciality = " + speciality + "; " +
                "course = " + course + "; " +
                "group = " + group + "}";
    }
}
