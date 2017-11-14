package ludwa.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {

    private Timer timer;

    private Config gameConfig;

    private Snake snake;

    public Board(Config config, Snake snake)
    {
        this.gameConfig = config;
        this.snake = snake;

        addKeyListener(new Keys());
        setBackground(gameConfig.getBackgroundColor());
        setFocusable(true);

        setPreferredSize(new Dimension(gameConfig.getWidth(), gameConfig.getHeight()));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        draw(g);
    }

    public void draw(Graphics g)
    {
        /*drawEndGame(g);*/
        drawSnake(g);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        System.out.println("Doing my stuff."); //todo
        repaint();
    }

    private void drawSnake(Graphics g)
    {
        for (int i=0; i < snake.getJointsNumber(); i++) {
            if (i == 0) {
                drawPoint(g, snake.getHeadPosition(), Color.GREEN);
            } else {
                drawPoint(g, snake.getJointPosition(i), Color.BLUE);
            }
        }
    }

    private void drawPoint(Graphics g, Point point, Color color)
    {
        g.setColor(color);
        g.fillRect(point.getX(),point.getY(), gameConfig.getPixelSize(), gameConfig.getPixelSize());
    }

    private void drawEndGame(Graphics g)
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
                    System.out.println("You pressed the 'Up Arrow' key.");
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("You pressed the 'Down Arrow' key.");
                    break;
                case KeyEvent.VK_LEFT:
                    System.out.println("You pressed the 'Left Arrow' key.");
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("You pressed the 'Right Arrow' key.");
                    break;
            }
        }
    }
}