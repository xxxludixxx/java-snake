package ludwa.snake;

public class SnakeMover {

    public static void move(Snake snake)
    {
        Point newPosition = snake.getHeadPosition();
        // UP
        if (snake.getDirection() == Snake.Direction.UP) {
            newPosition.setY(snake.getHeadPosition().getY() - 1);
        }
        // DOWN
        if (snake.getDirection() == Snake.Direction.DOWN) {
            newPosition.setY(snake.getHeadPosition().getY() + 1);
        }

        if (snake.getDirection() == Snake.Direction.LEFT) {
            newPosition.setX(snake.getHeadPosition().getX() - 1);
        }

        if (snake.getDirection() == Snake.Direction.RIGHT) {
            newPosition.setX(snake.getHeadPosition().getX() + 1);
        }

        snake.setHeadPosition(newPosition);

    }

}