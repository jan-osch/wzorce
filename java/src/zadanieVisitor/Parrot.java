package zadanieVisitor;

public class Parrot extends Animal {
    public Parrot() {
        super(1, 1, 1);
    }

    @Override
    void accept(HotelStaff hotelStaff) {
        hotelStaff.takeCare(this);
    }
}
