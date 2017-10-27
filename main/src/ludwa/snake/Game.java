package ludwa.snake;

import java.util.Timer;

public class Game {

    private boolean inGame;
    private Timer timer;
    private Snake snake;
    private Food food;
    private SnakeMover snakeMover;
    private Board board;
    private Config config;

    public Game(Config config)
    {
        this.inGame = true;
        this.timer = new Timer();
        this.snakeMover = new SnakeMover();
        this.config = config;
        this.board = new Board(config);
        this.snake = new Snake();
        this.food = new Food();
    }

    private void checkFoodCollisions()
    {

    }

    private void checkWallCollisions()
    {

    }

    public void start()
    {
        snake.initializePosition((config.getHeight() / 2), (config.getWidth() / 2));
        food.initializePosition((config.getHeight() / 2), (config.getWidth() / 2));
    }
}
