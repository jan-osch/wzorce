package zadanieVisitor;

public class Cat extends Animal {
    public Cat() {
        super(4, 2, 2);
    }

    @Override
    void accept(HotelStaff hotelStaff) {
        hotelStaff.takeCare(this);
    }
}
