package ludwa.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    private Timer timer;

    private Config gameConfig;

    public Board(Config config) {
        this.gameConfig = config;

        setBackground(gameConfig.getBackgroundColor());
        setFocusable(true);

        setPreferredSize(new Dimension(gameConfig.getWidth(), gameConfig.getHeight()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        draw(g);
    }

    void draw(Graphics g) {
        g.setColor(Color.red);

        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("working"); //todo
    }
}