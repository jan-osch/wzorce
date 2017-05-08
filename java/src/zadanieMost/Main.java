package zadanieMost;

public class Main {
    public static void main(String[] args) {
        new Circle(ASCIIDrawApiFactory.getInstance(), 20, 20, 20);
        new Rectangle(SwingDrawApiFactory.getIntance(), 10, 10, 5, 8).draw();
    }
}
