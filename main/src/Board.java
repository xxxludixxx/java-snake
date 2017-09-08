import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements ActionListener {

    // Size
    private final static int BOARDWIDTH = 1024;
    private final static int BOARDHEIGHT = 768;
    // Pixel Size
    private final static int PIXEL = 16;
    private final static int TOTALPIXELS = (BOARDWIDTH * BOARDHEIGHT) / (PIXEL * PIXEL);

    private Timer timer;

    private static int speed = 20;

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

        drawGradient(g);

        draw(g);
    }

    void draw(Graphics g) {

        g.setColor(Color.red);
        drawCenteredCircle(g, circle.getCircleX(), circle.getCircleY(), circle.getCircleR());

        Toolkit.getDefaultToolkit().sync();
    }

    void drawGradient(Graphics g)
    {
        final BufferedImage image;
        int[] Color1 = {255, 255, 0};
        int[] Color2 = {42, 106, 255};
        image = (BufferedImage) createImage(BOARDWIDTH, BOARDHEIGHT);
        WritableRaster raster = image.getRaster();
        for (int row = 0; row < BOARDHEIGHT; row++) {
            float t = (float) row / BOARDHEIGHT;
            for (int col = 0; col < BOARDWIDTH; col++) {
                float[] InterpolatedColor = interpolate(Color1, Color2, t);
                raster.setPixel(col, row, InterpolatedColor);
            }
        }

        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

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

    public float[] interpolate(int[] color1, int[] color2, float t) {
        float[] InterpolatedColor = {0, 0, 0};

        InterpolatedColor[0] = color1[0] + (color2[0] - color1[0]) * t;
        InterpolatedColor[1] = color1[1] + (color2[1] - color1[1]) * t;
        InterpolatedColor[2] = color1[2] + (color2[2] - color1[2]) * t;

        return InterpolatedColor;
    }

}