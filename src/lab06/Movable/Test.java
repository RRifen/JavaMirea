package lab06.Movable;

public class Test {
    public static void main(String[] args) {
        MovableCircle circ = new MovableCircle(1, 1, -1, 2, 3);
        MovableRectangle rect = new MovableRectangle(1, 1, 2, 3, 2, 2);
        circ.moveLeft();
        System.out.println(circ);
        if (rect.isSpeedEquals()) {
            rect.moveDown();
            rect.moveRight();
            System.out.println(rect);
        }
    }
}
