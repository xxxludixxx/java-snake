package ludwa.snake;

import java.awt.*;

public class Config {

    private static int width;
    private static int height;
    private static int pixelSize;
    private static int totalPixels;
    private static int speed;
    private static int startLength;
    private static Color backgroundColor;
    private static Color snakeHeadColor;
    private static Color snakeBodyColor;
    private static Color foodColor;

    public Config(int w, int h, int s)
    {
        width = w;
        height = h;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = s;
        startLength = 3;

        backgroundColor = Color.BLACK;
        snakeHeadColor = Color.GREEN;
        snakeBodyColor = Color.BLUE;
        foodColor = Color.RED;
    }

    public Config(int w, int h)
    {
        width = w;
        height = h;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = 10;
        startLength = 3;

        backgroundColor = Color.BLACK;
        snakeHeadColor = Color.GREEN;
        snakeBodyColor = Color.BLUE;
        foodColor = Color.RED;
    }

    public Config()
    {
        width = 1200;
        height = 762;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = 120;
        startLength = 3;

        backgroundColor = Color.BLACK;
        snakeHeadColor = Color.GREEN;
        snakeBodyColor = Color.BLUE;
        foodColor = Color.RED;
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

    public Color getFoodColor() {
        return foodColor;
    }

    public int getLength() {
        return startLength;
    }
}
