package ludwa.snake;

import java.util.ArrayList;

public class Snake {

    private ArrayList<Point> snakePositions = new ArrayList<>();

    private enum Direction {
        LEFTUP,
        LEFTDOWN,
        RIGHTUP,
        RIGHTDOWN
    }

    private Direction snakeDirection;

    public void Snake()
    {
        this.snakeDirection = Direction.LEFTUP;
    }

    public void initializePozition()
    {
        for (int i = 0; i <= 3 ; i++){
            snakePositions.add(new Point());
        }
    }

    public void setDirection(Direction direction)
    {
        this.snakeDirection = direction;
    }

}