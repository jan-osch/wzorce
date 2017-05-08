package zadanieMost;

public class SwingDrawApiFactory extends AbstractDrawApiFactory {
    static SwingDrawApiFactory intance;

    private SwingDrawApiFactory() {
    }

    static SwingDrawApiFactory getIntance() {
        if (SwingDrawApiFactory.intance == null) {
            SwingDrawApiFactory.intance = new SwingDrawApiFactory();
        }

        return SwingDrawApiFactory.intance;
    }

    @Override
    DrawAPI buildDrawApi() {
        return new DrawSwing();
    }
}
