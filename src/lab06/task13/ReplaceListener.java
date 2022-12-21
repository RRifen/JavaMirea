package lab06.task13;

public class ReplaceListener implements StringListener{
    @Override
    public void update(String eventType) {
        System.out.println("Вызов метода Replace");
    }
}
