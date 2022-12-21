package lab18.task01;

public class Exception2 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}
