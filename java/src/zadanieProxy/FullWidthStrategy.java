package zadanieProxy;

import java.util.ArrayList;
import java.util.List;

public class FullWidthStrategy implements PackingStrategy {

    private int availableHeight;
    private int pageHeight;
    private int pageWidth;
    private List<Image> currentPage;
    private List<List<Image>> result;


    private void initialize(int pageHeight, int pageWidth) {
        this.pageWidth = pageWidth;
        this.result = new ArrayList<>();
        this.currentPage = new ArrayList<>();
        this.availableHeight = pageHeight;
        this.pageHeight = pageHeight;
    }

    @Override
    public List<List<Image>> packImages(List<Image> list, int pageWidth, int pageHeight) {
        this.initialize(pageHeight, pageWidth);

        for (Image i : list) {
            i.setScale((float)  pageWidth / i.getWidth());

            boolean wouldFitInAvailableSpace = i.getHeight() <= this.availableHeight && i.getWidth() <= this.pageWidth;
            boolean wouldFitOnNewPage = i.getHeight() <= this.pageHeight && i.getWidth() <= this.pageWidth;

            if (wouldFitInAvailableSpace) {
                this.addToCurrentPage(i);
            } else if (wouldFitOnNewPage) {
                this.closePage();
                this.addToCurrentPage(i);
            } else {
                this.closePage();
                i.setScale((float) (i.getHeight() / pageHeight));
                this.addToCurrentPage(i);
            }
        }

        this.closePageIfNeeded();
        return this.result;
    }

    private void closePageIfNeeded() {
        if (this.currentPage.size() > 0) {
            this.closePage();
        }
    }

    private void addToCurrentPage(Image i) {
        this.availableHeight -= i.getHeight();
        this.currentPage.add(i);
    }

    private void closePage() {
        this.result.add(this.currentPage);
        this.currentPage = new ArrayList<>();
        this.availableHeight = this.pageHeight;
    }
}
