package lab11.task03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

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

    private GregorianCalendar birthDay;

    private int format;

    public Student(double GPA, String name, String secondName, String speciality, int course, String group, GregorianCalendar birthDay) {
        this.GPA = GPA;
        this.name = name;
        this.secondName = secondName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.birthDay = birthDay;
    }

    public void setFormat(int format) {
        this.format = format; // 0 - short, 1 - average, 2 - full
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat;
        if (format == 0) {
            simpleDateFormat = new SimpleDateFormat("d.M.y");
        }
        else if (format == 1) {
            simpleDateFormat = new SimpleDateFormat("EEE. d MMM y 'г.'");
        }
        else {
            simpleDateFormat = new SimpleDateFormat("EEEE d MMMM y 'г.'");
        }
        return "{name = " + name + "; " + "birthDay = " + simpleDateFormat.format(birthDay.getTime()) + "}";
    }
}
