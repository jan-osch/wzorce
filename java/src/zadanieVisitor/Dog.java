package zadanieVisitor;

public class Dog extends Animal {
    @Override
    void accept(HotelStaff hotelStaff) {
        hotelStaff.takeCare(this);
    }
}
