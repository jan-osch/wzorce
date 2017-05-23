package zadanieMediator;

public class Main {
    public static void main(String[] args) {


        TaxiMediator mediator = new TaxiMediator();

        mediator.register(new Taxi(0, 0, 1, "Opelek"));
        mediator.register(new Taxi(5, 5, 2, "Audi"));
        mediator.register(new Taxi(10, 10, 3, "BMW"));

        Customer jan = new Customer(3, 3, "Jan", mediator);

        jan.callTaxi(5);

    }
}
