package lab17.task02;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        salary = workedHours * hourlyRate;
        if (position.equals("A")) {
            salary *= 2;
        }
        else if (position.equals("B")) {
            salary *= 1.5;
        }
        else if (position.equals("C")) {
            salary *= 1.2;
        }
        return salary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String name = "";
    private double salary;
    private int workedHours;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    private int hourlyRate;
    private String position;

}
