package zadanieMost;

public class Rectangle extends Shape {
    private int x;
    private int y;
    private int w;
    private int h;

    public Rectangle(AbstractDrawApiFactory factory, int x, int y, int w, int h) {
        super(factory);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    void draw() {
        drawAPI.drawRectangle(this.x, this.y, this.w, this.h);
    }
}
