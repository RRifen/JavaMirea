package lab17.task02;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = new Employee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateViewAll();
    }

}
