package ludwa.snake;

import java.util.ArrayList;

public class Snake {

    private ArrayList<Point> snakePositions = new ArrayList<>();
    private int length;


    enum Direction
    {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    private Direction snakeDirection;

    public Snake(int length)
    {
        this.length = length;
        this.snakeDirection = Direction.LEFT;
    }

    public void initializePosition(int maxX, int maxY)
    {
        // Initialize head
        Point head = new Point();
        head.random(maxX, maxY);
        snakePositions.add(head);

        for (int i = 1; i <= this.length ; i++) {
            snakePositions.add(new Point((head.x + i), (head.y + i)));
        }
    }

    public void setDirection(Direction direction)
    {
        this.snakeDirection = direction;
    }

    public Direction getDirection()
    {
        return this.snakeDirection;
    }

    public Point getHeadPosition()
    {
        return snakePositions.get(0);
    }

    public Point getJointPosition(int number)
    {
        return  snakePositions.get(number);
    }

    public int getJointsNumber()
    {
        return snakePositions.size();
    }

    public void addJoint()
    {
        snakePositions.add(new Point((getHeadPosition().x + snakePositions.size()), (getHeadPosition().y + snakePositions.size())));
    }

}