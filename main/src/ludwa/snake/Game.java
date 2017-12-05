package ludwa.snake;

import javax.swing.Timer;

public class Game {

    public boolean inGame;
    private Timer timer;
    private Snake snake;
    private Food food;
    private SnakeMover snakeMover;
    private Board board;
    private Config config;

    public Game(Config config)
    {
        this.config = config;
        this.snake = new Snake(config.getLength());
        this.food = new Food();
        this.snakeMover = new SnakeMover(config);
        this.board = new Board(config, this.snake, this.food);
    }

    private void checkFoodCollisions()
    {
        if(snake.getHeadPosition() == food.getFoodPosition()) {
            System.out.println("Successfully eaten food");
            // Add points #todo
            snake.addJoint();
            food.randomFoodPosition(config.getHeight(), config.getWidth());
        }
    }

    private void checkSelfCollisions()
    {
        for (int i = this.snake.getJointsNumber(); i > 0; i--) {
            if ((i > 5) && (this.snake.getHeadPosition() == this.snake.getJointPosition(i))) {
                inGame = false;
            }
        }
    }

    private void checkWallCollisions()
    {
        if (snake.getHeadPosition().getY() >= config.getHeight()) {
            inGame = false;
        }

        if (snake.getHeadPosition().getY() < 0) {
            inGame = false;
        }

        if (snake.getHeadPosition().getX() >= config.getWidth()) {
            inGame = false;
        }

        if (snake.getHeadPosition().getX() < 0) {
            inGame = false;
        }
    }

    public void checkCollisions()
    {
        checkSelfCollisions();
        checkWallCollisions();
        checkFoodCollisions();

        if (!inGame) {
            timer.stop();
        }
    }

    public void start() throws InterruptedException {
        if(!inGame) {
            // Initialize Snake
            snake.initializePosition((config.getHeight() / 2), (config.getWidth() / 2));
            snake.setDirection(Snake.Direction.LEFT);
            // Initialize food
            food.initializePosition((config.getHeight() / 2), (config.getWidth() / 2));
            // Mark in game
            this.inGame = true;
            // Start timer
            this.timer = new Timer(this.config.getSpeed(), this.board);
            this.timer.start();
            System.out.println("Snake X position = " + snake.getHeadPosition().getX() + "\n");
            System.out.println("Snake Y position = " + snake.getHeadPosition().getY() + "\n");

            System.out.println("Snake number of joints = " + snake.getJointsNumber() + "\n");

            System.out.println("Food X position = " + food.getFoodPosition().getX() + "\n");
            System.out.println("Food Y position = " + food.getFoodPosition().getY() + "\n");
        } else {
            throw new InterruptedException("The game has already started...");
        }
    }

    public Board getBoard()
    {
        return this.board;
    }

    public boolean isInGame()
    {
        return inGame;
    }
}