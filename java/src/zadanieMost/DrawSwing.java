package zadanieMost;

import javax.swing.*;
import java.awt.*;

public class DrawSwing implements DrawAPI {

    @Override
    public void drawCircle(int x, int y, int radius) {
        createWindow(new CircleComponent(x, y, radius));
    }

    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        createWindow(new RectangleComponent(x, y, width, height));
    }

    public static void createWindow(JComponent component) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.add(component);
        window.setVisible(true);
    }

    private class RectangleComponent extends JComponent {
        private int x;
        private int y;
        private int width;
        private int h;

        private RectangleComponent(int x, int y, int width, int heigh) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.h = heigh;
        }

        public void paint(Graphics g) {
//            super.paint(g);

            Graphics2D comp2D = (Graphics2D) g;
            comp2D.setColor(Color.red);
            comp2D.fillRect(this.x * 10, this.y * 10, this.width * 10, this.h * 10);
        }
    }

    private class CircleComponent extends JComponent {
        private int x;
        private int y;
        private int radius;

        private CircleComponent(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public void paint(Graphics g) {
//            super.paint(g);

            Graphics2D comp2D = (Graphics2D) g;
            comp2D.setColor(Color.red);
            comp2D.fillOval(this.x * 10, this.y * 10, this.radius * 10, this.radius * 10);
        }
    }
}
