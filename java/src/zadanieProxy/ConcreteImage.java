package zadanieProxy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ConcreteImage implements Image {
    private String path;
    private float scale;
    private int width;
    private int height;

    public ConcreteImage(String path) {
        this.path = path;
        this.scale = 1.0f;
    }

    @Override
    public int getWidth() {
        this.reloadSizeIfNeeded();
        return (int) (this.width * this.getScale());
    }

    @Override
    public int getHeight() {
        this.reloadSizeIfNeeded();
        return (int) (this.height * this.getScale());
    }

    @Override
    public float getScale() {
        return this.scale;
    }

    private void reloadSizeIfNeeded() {
        if (this.height == 0 && this.width == 0) {
            try {
                BufferedImage img = ImageIO.read(new File(this.path));
                this.height = img.getHeight();
                this.width = img.getWidth();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void display() {
        try {
            BufferedImage img = ImageIO.read(new File(this.path));

            ImageIcon icon = new ImageIcon(img);
            JFrame frame = new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(this.getWidth(), this.getHeight());
            JLabel lbl = new JLabel();
            lbl.setIcon(icon);
            frame.add(lbl);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setScale(float scale) {
        this.scale = scale;
    }

    @Override
    public String getName() {
        return this.path;
    }
}
