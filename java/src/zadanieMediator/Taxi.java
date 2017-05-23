package zadanieMediator;

public class Taxi extends TrafficParticipant {
    private int pricePerKm;

    private String carBrand;

    public Taxi(int x, int y, int pricePerKm, String carBrand) {
        super(x, y);
        this.pricePerKm = pricePerKm;
        this.carBrand = carBrand;
    }

    public void pickPassenger(int x, int y, String name) {
        System.out.println(this.carBrand + " driving to pick up passenger: " + name + " to: x:" + x + " y: " + y);
    }

    public int computePrice(int distance) {
        return this.pricePerKm * distance;
    }
}
