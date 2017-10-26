package ludwa.snake;

import java.util.Random;

public class Point {

    protected int x;
    protected int y;

    public void random(int maxX, int maxY)
    {
        Random random = new Random();
        this.x = random.nextInt(maxX);
        this.y = random.nextInt(maxY);
    }

}
