package ludwa.snake;

public class Config {
    private static int width;
    private static int height;
    private static int pixelSize;
    private static int totalPixels;
    private static int speed;
    private static String backgroundColor;
    private static String snakeHeadColor;
    private static String snakeBodyColor;

    public Config(int w, int h, int s) {
        width = w;
        height = h;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = s;

        backgroundColor = "BLACK";
        snakeHeadColor = "GREEN";
        snakeBodyColor = "BLUE";

    }

    public Config(int w, int h) {
        width = w;
        height = h;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = 60;

        backgroundColor = "BLACK";
        snakeHeadColor = "GREEN";
        snakeBodyColor = "BLUE";

    }

    public Config() {
        width = 1200;
        height = 762;
        pixelSize = 16;
        totalPixels = (width * height) / (pixelSize * pixelSize);
        speed = 60;

        backgroundColor = "BLACK";
        snakeHeadColor = "GREEN";
        snakeBodyColor = "BLUE";

    }

}
