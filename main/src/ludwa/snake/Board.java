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

    public Board(Config config)
    {
        this.gameConfig = config;

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

    void draw(Graphics g)
    {
        drawEndGame(g);
        Toolkit.getDefaultToolkit().sync();
        return;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        System.out.println("Doing my stuff."); //todo
        repaint();
    }

    private void drawSnake(Graphics g)
    {

    }

    private void drawFood(Graphics g)
    {

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