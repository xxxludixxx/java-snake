import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setDefaultLookAndFeelDecorated(true);
                frame.setResizable(false);
                Raster rt = new Raster();
                frame.add(rt, BorderLayout.CENTER);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }


}
