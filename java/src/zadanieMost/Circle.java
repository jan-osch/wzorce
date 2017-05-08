package zadanieMost;

public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(AbstractDrawApiFactory factory,int radius, int x, int y) {
        super(factory);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(this.x, this.y, this.radius);
    }
}
