package ludwa.snake;

import java.util.Random;

public class Point {

    protected int x;
    protected int y;


    public Point()
    {

    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
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
}