package lab17.task02;

public class EmployeeController {

    private Employee model;
    private EmployeeView view;

    EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeWorkedHours(int workedHours) {
        model.setWorkedHours(workedHours);
    }

    public int getEmployeeWorkedHours() {
        return model.getWorkedHours();
    }

    public void setEmployeeHourlyRate(int hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public int getEmployeeHourlyRate() {
        return model.getHourlyRate();
    }

    public void setEmployeePosition(String position) {
        model.setPosition(position);
    }

    public String getEmployeePosition() {
        return model.getPosition();
    }

    public double getEmployeeSalary() {
        return model.getSalary();
    }

    public void updateViewAll() {
        int choice = view.choiceFirst();
        if (choice == 1) {
            model.setName(view.inputEmployeeName());
            model.setWorkedHours(view.inputEmployeeWorkedHours());
            model.setHourlyRate(view.inputEmployeeHourlyRate());
            model.setPosition(view.inputEmployeePosition());
            view.printEmployeeDetails(model.getName(), model.getSalary(), model.getWorkedHours(), model.getHourlyRate(), model.getPosition());
        } else {
            model.setWorkedHours(view.inputEmployeeWorkedHours());
            model.setHourlyRate(view.inputEmployeeHourlyRate());
            model.setPosition(view.inputEmployeePosition());
            view.printEmployeeDetails(model.getName(), model.getSalary(), model.getWorkedHours(), model.getHourlyRate(), model.getPosition());
        }
        choice = view.choiceSecond();
        while (choice != 0) {
            choice = view.choiceThird();
            if (choice == 1) {
                model.setName(view.inputEmployeeName());
                model.setWorkedHours(view.inputEmployeeWorkedHours());
                model.setHourlyRate(view.inputEmployeeHourlyRate());
                model.setPosition(view.inputEmployeePosition());
            } else if (choice == 2) {
                model.setWorkedHours(view.inputEmployeeWorkedHours());
                model.setHourlyRate(view.inputEmployeeHourlyRate());
                model.setPosition(view.inputEmployeePosition());
            } else if (choice == 3) {
                view.printEmployeeDetails(model.getName(), model.getSalary(), model.getWorkedHours(), model.getHourlyRate(), model.getPosition());
            } else if (choice == 4) {
                view.printEmployeeSalaryAndFormulaOutput(model.getSalary(), model.getWorkedHours(), model.getHourlyRate(), model.getPosition());
            } else if (choice == 5) {
                view.printEmployeeSalary(model.getSalary());
            } else if (choice == 0) {
                break;
            }
        }
    }

    public void updateViewSalary() {
        view.printEmployeeSalary(model.getSalary());
    }

    public void updateViewSalaryAndFormulaOutput() {
        view.printEmployeeSalaryAndFormulaOutput(model.getSalary(), model.getWorkedHours(), model.getHourlyRate(), model.getPosition());
    }
}
