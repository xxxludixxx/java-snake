package ludwa.snake;

import java.util.Random;

public class Point {

    protected int x;
    protected int y;

    public Point(int maxX, int maxY)
    {
        random(maxX, maxY);
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