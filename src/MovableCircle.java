public class MovableCircle extends MovablePoint implements Movable {
    @Override
    public void moveUp() {}
    @Override
    public void moveDown() {}
    @Override
    public void moveLeft() {}
    @Override
    public void moveRight() {}

    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return super.toString();
    }
}
