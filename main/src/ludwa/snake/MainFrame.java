package ludwa.snake;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(Config config)
    {
        setResizable(false);
        pack();

        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run()
            {
                Config config = Config.getInstance();
                Game game = new Game(config);

                try {
                    game.start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                JFrame frame = new MainFrame(config);
                frame.add(game.getBoard());
                frame.setVisible(true);
                frame.pack();
            }
        });
    }
}