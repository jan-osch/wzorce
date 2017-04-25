package zadanieVisitor;

public class Cat extends Animal {
    @Override
    void accept(HotelStaff hotelStaff) {
        hotelStaff.takeCare(this);
    }
}
