package ludwa.snake;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(Config config) {
        add(new Board(config));
        setResizable(false);
        pack();
        setVisible(true);

        setTitle("Bouncing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MainFrame(new Config());
                frame.setVisible(true);
            }
        });
    }

}
