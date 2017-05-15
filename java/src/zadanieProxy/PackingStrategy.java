package zadanieProxy;

import java.util.List;

public interface PackingStrategy {

    List<List<Image>> packImages(List<Image> list, int pageWidth, int pageHeight);
}
