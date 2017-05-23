package zadanieMediator;

public class TrafficParticipant {
    private int x;
    private int y;
    private Mediator mediator;

    public TrafficParticipant(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
