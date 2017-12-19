package ludwa.snake;

public class SnakeMover {

    private Config config;

    public SnakeMover(Config config)
    {
        this.config = config;
    }

    public Snake move(Config gameConfig, Snake snake)
    {
        Point newHeadPosition = snake.getHeadPosition();

        switch (snake.getDirection()) {
            case UP:
                newHeadPosition.setY(newHeadPosition.getY() - gameConfig.getPixelSize());
                break;
            case DOWN:
                newHeadPosition.setY(newHeadPosition.getY() + gameConfig.getPixelSize());
                break;
            case LEFT:
                newHeadPosition.setX(newHeadPosition.getX() - gameConfig.getPixelSize());
                break;
            case RIGHT:
                newHeadPosition.setX(newHeadPosition.getX() + gameConfig.getPixelSize());
                break;
        }



        // Testing purposes
        System.out.println("X: " + snake.getHeadPosition().getX() + " Y: " + snake.getHeadPosition().getY());

        for (int i = snake.getJointsNumber() - 1; i > 0; i++) {
            snake.setJointPosition(i, snake.getJointPosition( i - 1));
        }

        snake.setHeadPosition(newHeadPosition);

        // Testing purposes
        /*System.out.println("X: " + snake.getHeadPosition().getX() + " Y: " + snake.getHeadPosition().getY());*/

        return snake;
    }

}