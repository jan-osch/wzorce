package zadanieProxy;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ImageProxy implements Image {
    private String path;
    private float scale;
    private int height;
    private int width;

    public ImageProxy(String path) {
        this.path = path;
        this.scale = 1.0f;
    }

    @Override
    public void display() {
        new ConcreteImage(this.path).display();
    }

    @Override
    public int getWidth() {
        this.loadSizesIfNeeded();

        return (int) (this.width * this.scale);
    }

    @Override
    public int getHeight() {
        this.loadSizesIfNeeded();

        return (int) (this.height * this.scale);
    }

    @Override
    public float getScale() {
        return this.scale;
    }

    @Override
    public void setScale(float scale) {
        this.scale = scale;
    }

    @Override
    public String getName() {
        return this.path;
    }

    private void loadSizesIfNeeded() {
        if (this.height == 0 && this.width == 0) {
            try (ImageInputStream in = ImageIO.createImageInputStream(new File(this.path))) {
                final Iterator<ImageReader> readers = ImageIO.getImageReaders(in);
                if (readers.hasNext()) {
                    ImageReader reader = readers.next();
                    try {
                        reader.setInput(in);
                        this.width = reader.getWidth(0);
                        this.height = reader.getHeight(0);
                    } finally {
                        reader.dispose();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
