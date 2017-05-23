package zadanieMediator;

public class Customer extends TrafficParticipant {
    private String name;
    private Mediator mediator;

    public Customer(int x, int y, String name, Mediator mediator) {
        super(x, y);
        this.name = name;
        this.mediator = mediator;
    }

    public void callTaxi(int maxPrice) {
        mediator.taxiNeeded(this, maxPrice);
    }

    public String getName() {
        return name;
    }
}
