package ludwa.snake;

import java.awt.*;

public class Config {

    private static int width;
    private static int height;
    private static int pixelSize;
    private static int totalPixels;
    private static int speed;
    private static Color backgroundColor;
    private static Color snakeHeadColor;
    private static Color snakeBodyColor;

    public Config(int w, int h, int s)
    {
        width = w;
        height = h;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = s;

        backgroundColor = Color.BLACK;
        snakeHeadColor = Color.GREEN;
        snakeBodyColor = Color.BLUE;

    }

    public Config(int w, int h)
    {
        width = w;
        height = h;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = 60;

        backgroundColor = Color.BLACK;
        snakeHeadColor = Color.GREEN;
        snakeBodyColor = Color.BLUE;

    }

    public Config()
    {
        width = 1200;
        height = 762;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = 60;

        backgroundColor = Color.BLACK;
        snakeHeadColor = Color.GREEN;
        snakeBodyColor = Color.BLUE;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getPixelSize()
    {
        return pixelSize;
    }

    public int getTotalPixels() {
        return totalPixels;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getSnakeHeadColor() {
        return snakeHeadColor;
    }

    public Color getSnakeBodyColor() {
        return snakeBodyColor;
    }
}
