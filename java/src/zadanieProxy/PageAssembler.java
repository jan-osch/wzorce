package zadanieProxy;

import java.util.ArrayList;
import java.util.List;

public class PageAssembler {

    private final List<Image> images;
    private int pageWidth;
    private int pageHeight;
    private PackingStrategy strategy;


    public PageAssembler(int pageWidth, int pageHeight, PackingStrategy strategy) {
        this.pageWidth = pageWidth;
        this.pageHeight = pageHeight;
        this.strategy = strategy;
        this.images = new ArrayList<>();
    }

    void addImage(Image i) {
        this.images.add(i);
    }

    public void pack() {
        List<List<Image>> lists = this.strategy.packImages(this.images, this.pageWidth, this.pageHeight);
        int pageIndex = 1;

        for (List<Image> page : lists) {
            System.out.println("Page " + pageIndex);

            for (Image image : page) {
                System.out.println(image.getName() + " " + image.getWidth() + "x" + image.getHeight() + " scale: " + image.getScale());
            }

            pageIndex++;
        }
    }
}
