package zadanieVisitor;

public class Parrot extends Animal {
    @Override
    void accept(HotelStaff hotelStaff) {
        hotelStaff.takeCare(this);
    }
}
