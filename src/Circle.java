public class Circle
{

    private int circleX = 30;
    private int circleY = 40;
    private int circleR = 25;

    private boolean movingLeft = false;
    private boolean movingRight = false;
    private boolean movingUp = false;
    private boolean movingDown = false;

    public int getCircleX() {
        return circleX;
    }

    public int getCircleY() {
        return circleY;
    }

    public int getCircleR() { return circleR; }

    public boolean isMovingLeft() {
        return movingLeft;
    }

    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
    }

    public boolean isMovingRight() {
        return movingRight;
    }

    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }

    public boolean isMovingUp() {
        return movingUp;
    }

    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }

    public boolean isMovingDown() {
        return movingDown;
    }

    public void setMovingDown(boolean movingDown) {
        this.movingDown = movingDown;
    }

    public void move() {
        // Left
        if (isMovingLeft()) {
            circleX -= Board.getDotSize();
        }
        // Right
        if (isMovingRight()) {
            circleX += Board.getDotSize();
        }
        // Up
        if (isMovingUp()) {
            circleY -= Board.getDotSize();
        }
        // Down
        if (isMovingDown()) {
            circleY += Board.getDotSize();
        }
    }

}