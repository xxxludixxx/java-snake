package ludwa.snake;

import java.util.ArrayList;

public class Snake {

    private ArrayList<Point> snakePositions = new ArrayList<>();

    private Direction snakeDirection;

    private int length;

    enum Direction
    {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Snake(int length)
    {
        this.length = length;
        this.snakeDirection = Direction.LEFT;
    }

    public void initializePosition(int maxX, int maxY)
    {
        // Initialize head
        Point head = new Point(maxX, maxY);
        head.random(maxX, maxY);
        snakePositions.add(head);

        for (int i = 1; i <= this.length ; i++) {

            Point joint = new Point(head.getX() + i * 16, head.getY());

            snakePositions.add(joint);
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

    public void setHeadPosition(Point head)
    {
            this.snakePositions.set(0, head);
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

    }

}