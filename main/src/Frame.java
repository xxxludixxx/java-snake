import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    Frame() {
        add(new Board());
        setResizable(false);
        pack();

        setTitle("Bouncing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Frame();
                frame.setVisible(true);
            }
        });
    }

}
