package ludwa.snake;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(Config config) {
        add(new Board(config));
        setResizable(false);
        pack();

        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Config config = new Config(1200, 800);
                Game game = new Game();

                JFrame frame = new MainFrame(config);
                frame.setVisible(true);
            }
        });
    }

}
