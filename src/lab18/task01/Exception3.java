package lab18.task01;

public class Exception3 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception3 exception3 = new Exception3();
        exception3.exceptionDemo();
    }
}
