import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class Raster extends JPanel {

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;

    public Raster() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void paintComponent(Graphics g) {

        final BufferedImage image;
        int[] Color1 = {255, 255, 0};
        int[] Color2 = {42, 106, 255};
        image = (BufferedImage) createImage(WIDTH, HEIGHT);
        WritableRaster raster = image.getRaster();
        for (int row = 0; row < HEIGHT; row++) {
            float t = (float) row / HEIGHT;
            for (int col = 0; col < WIDTH; col++) {
                float[] InterpolatedColor = interpolate(Color1, Color2, t);
                raster.setPixel(col, row, InterpolatedColor);
            }
        }

        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

    }

    public float[] interpolate(int[] color1, int[] color2, float t) {
        float[] InterpolatedColor = {0, 0, 0};

        InterpolatedColor[0] = color1[0] + (color2[0] - color1[0]) * t;
        InterpolatedColor[1] = color1[1] + (color2[1] - color1[1]) * t;
        InterpolatedColor[2] = color1[2] + (color2[2] - color1[2]) * t;

        return InterpolatedColor;
    }

}