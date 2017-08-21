import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    // Size
    private final static int BOARDWIDTH = 1024;
    private final static int BOARDHEIGHT = 768;
    // Pixel Size
    private final static int PIXEL = 16;

    private Timer timer;

    private static int speed = 30;

    private Circle circle = new Circle();

    public Board() {

        setBackground(Color.BLACK);
        setFocusable(true);

        setPreferredSize(new Dimension(BOARDWIDTH, BOARDHEIGHT));

        initializeGame();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        draw(g);
    }

    void draw(Graphics g) {

        g.setColor(Color.green);
        drawCenteredCircle(g, circle.getCircleX(), circle.getCircleY(), circle.getCircleR());

        Toolkit.getDefaultToolkit().sync();
    }

    void drawCenteredCircle(Graphics g, int x, int y, int r) {
        x = x-(r/2);
        y = y-(r/2);
        g.fillOval(x,y,r,r);
    }

    void initializeGame() {
        circle.setMovingUp(true);
        circle.setMovingRight(true);
        timer = new Timer(speed, this);
        timer.start();
    }

    void checkCollisions() {
        if (circle.getCircleY() >= BOARDHEIGHT) {
            circle.setMovingDown(false);
            circle.setMovingUp(true);
        }

        if (circle.getCircleY() < 0) {
            circle.setMovingUp(false);
            circle.setMovingDown(true);
        }

        if (circle.getCircleX() >= BOARDWIDTH) {
            circle.setMovingRight(false);
            circle.setMovingLeft(true);
        }

        if (circle.getCircleX() < 0) {
            circle.setMovingLeft(false);
            circle.setMovingRight(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        checkCollisions();

        circle.move();

        repaint();
    }

    public static int getDotSize() {
        return PIXEL;
    }

}