package lab07.Task1_3;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(1, 1, 2, 3, 2, 2);
        if (rect.SpeedTest()) {
            rect.moveDown();
            rect.moveRight();
            System.out.println(rect);
        }
    }
}