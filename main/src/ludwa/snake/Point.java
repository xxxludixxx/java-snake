package ludwa.snake;

import java.util.Random;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y)
    {
        setX(x);
        setY(y);
    }

    public void random(int maxX, int maxY)
    {
        Random random = new Random();
        this.x = random.nextInt(maxX);
        this.y = random.nextInt(maxY);
    }

    protected int getX()
    {
        return this.x;
    }

    protected int getY()
    {
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}