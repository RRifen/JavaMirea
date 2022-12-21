package lab06.task13;

public class EchoListener implements StringListener{
    @Override
    public void update(String eventType) {
        System.out.println("Echo echo echo");
    }
}
