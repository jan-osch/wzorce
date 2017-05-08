package zadanieMost;

public class ASCIIDrawApiFactory extends AbstractDrawApiFactory {
    private static ASCIIDrawApiFactory instance;

    private ASCIIDrawApiFactory() {
    }

    static ASCIIDrawApiFactory getInstance() {
        if (ASCIIDrawApiFactory.instance == null) {
            ASCIIDrawApiFactory.instance = new ASCIIDrawApiFactory();
        }

        return ASCIIDrawApiFactory.instance;
    }

    @Override
    DrawAPI buildDrawApi() {
        return new DrawASCII();
    }
}
