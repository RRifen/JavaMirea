package lab17.task02;

public class EmployeeView {
    public void printEmployeeDetails(String employeeName, double salary, int workedHours, int hourlyRate, String position) {
        System.out.println("\nРаботник");
        System.out.println("Имя: " + (!employeeName.equals("") ? employeeName : "не указано"));
        System.out.println("Количество часов: " + workedHours);
        System.out.println("Оплата в час: " + hourlyRate);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата \uD83D\uDCB0: " + salary + "\n");
    }

    public void printEmployeeSalary(double salary) {
        System.out.println("\nЗарплата: " + salary + "\n");
    }

    public void printEmployeeSalaryAndFormulaOutput(double salary, int workedHours, int hourlyRate, String position) {
        System.out.println("\nОтработано часов: " + workedHours);
        System.out.println("Оплата в час: " + hourlyRate);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary + "\n");
    }

    public String inputEmployeeName() {
        System.out.print("Введите имя работника: ");
        return new java.util.Scanner(System.in).nextLine();
    }

    public int inputEmployeeWorkedHours() {
        System.out.print("Введите количество отработанных часов: ");
        return new java.util.Scanner(System.in).nextInt();
    }

    public int inputEmployeeHourlyRate() {
        System.out.print("Введите ставку в час: ");
        return new java.util.Scanner(System.in).nextInt();
    }

    public String inputEmployeePosition() {
        System.out.print("Введите должность работника (A, B, C или D): ");
        return new java.util.Scanner(System.in).nextLine();
    }

    public int choiceThird() {
        System.out.print("1 - полностью ввести данные сотрудника,\n2 - изменить данные для вычисления зарплаты,\n3 - вывести данные сотрудника,\n4 - вывести данные для вычисления зарплаты,\n5 - вывести зарплату,\n0 - выход\n-> ");
        return new java.util.Scanner(System.in).nextInt();
    }

    public int choiceSecond() {
        System.out.print("Желаете продолжить? 1 - да, 0 - нет\n-> ");
        return new java.util.Scanner(System.in).nextInt();
    }

    public int choiceFirst() {
        System.out.print("Выберите что хотите сделать: 1 - полностью ввести данные сотрудника, 2 - ввести данные для вычисления зарплаты\n-> ");
        return new java.util.Scanner(System.in).nextInt();
    }
}
