package zadanieMediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiMediator implements Mediator {


    private List<Taxi> vehicles;

    public TaxiMediator() {
        this.vehicles = new ArrayList<>();
    }

    @Override
    public void taxiNeeded(Customer customer, int maxPrice) {

        Taxi closest = getClosestTaxi(customer, maxPrice);

        if (closest != null) {
            closest.pickPassenger(customer.getX(), customer.getY(), customer.getName());
        } else {
            System.out.println("There is no taxi that that can serve: " + customer.getName());
        }
    }

    private Taxi getClosestTaxi(Customer customer, int maxPrice) {
        Taxi closest = null;
        int min = 0;

        for (Taxi t : vehicles) {

            int distance = this.getDistance(customer, t);
            int price = t.computePrice(distance);

            boolean isClosestAndWithinThePrice = price <= maxPrice && (closest == null || min > distance);
            if (isClosestAndWithinThePrice) {
                closest = t;
                min = distance;
            }
        }

        return closest;
    }

    private int getDistance(Customer customer, Taxi t) {
        int xPart = Math.abs(customer.getX() - t.getX());
        int yPart = Math.abs(customer.getY() - t.getY());

        return xPart + yPart;
    }

    void register(Taxi taxi) {
        this.vehicles.add(taxi);
    }
}
