package zadanieMost;

public abstract class Shape {
    DrawAPI drawAPI;

    public Shape(AbstractDrawApiFactory drawAPI) {
        this.drawAPI = drawAPI.buildDrawApi();
    }

    abstract void draw();
}
