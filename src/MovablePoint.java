public class MovablePoint implements Movable {
    @Override
    public void moveUp() {}
    @Override
    public void moveDown() {}
    @Override
    public void moveLeft() {}
    @Override
    public void moveRight() {}

    public int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return null;
    }

}
