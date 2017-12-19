package ludwa.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel {

    private Config gameConfig;
    private Snake snake;
    private Food food;
    private Image boardImage;
    private Graphics boardGraphics;

    /*private boolean inGame;*/

    public Board(Config config, Snake snake, Food food)
    {
        this.gameConfig = config;
        this.snake = snake;
        this.food = food;

        addKeyListener(new Keys());
        setBackground(gameConfig.getBackgroundColor());
        setFocusable(true);

        super.setPreferredSize(new Dimension(gameConfig.getWidth(), gameConfig.getHeight()));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        draw(g);
    }

    public void draw(Graphics g)
    {
        //if(!inGame()) {
            drawEndGame(g);
          /*  return;*/
        //}
        /*drawSnake(g, this.snake);
        drawFood(g, food);*/
        Toolkit.getDefaultToolkit().sync();
    }

    private void drawSnake(Graphics g, Snake snake)
    {
        for (int i = 0; i < snake.getJointsNumber(); i++) {
            if (i == 0) {
                drawPoint(g, snake.getHeadPosition(), gameConfig.getSnakeHeadColor());
            } else {
                drawPoint(g, snake.getJointPosition(i), gameConfig.getSnakeBodyColor());
            }
        }
    }

    private void drawPoint(Graphics g, Point point, Color color)
    {
        g.setColor(color);
        g.fillRect(point.getX(),point.getY(), gameConfig.getPixelSize(), gameConfig.getPixelSize());
    }

    private void drawFood(Graphics g, Food food)
    {
        drawPoint(g, food.getFoodPosition(), gameConfig.getFoodColor());
    }

    public void drawEndGame(Graphics g)
    {
        String msg = "The Game is Over";

        Font font = new Font("Times New Roman", Font.BOLD, 36);
        FontMetrics metrics = getFontMetrics(font);

        g.setColor(Color.RED);
        g.setFont(font);

        g.drawString(msg, ((gameConfig.getWidth() - metrics.stringWidth(msg)) / 2), (gameConfig.getHeight() / 2));

        System.out.println("GAME OVER");
    }

    private class Keys extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent keyEvent) {
            int key = keyEvent.getKeyCode();

            switch (key) {
                case KeyEvent.VK_UP:
                    snake.setDirection(Snake.Direction.UP);
                    break;
                case KeyEvent.VK_DOWN:
                    snake.setDirection(Snake.Direction.DOWN);
                    break;
                case KeyEvent.VK_LEFT:
                    snake.setDirection(Snake.Direction.LEFT);
                    break;
                case KeyEvent.VK_RIGHT:
                    snake.setDirection(Snake.Direction.RIGHT);
                    break;
            }
        }
    }
}