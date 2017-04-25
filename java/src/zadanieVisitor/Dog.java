package zadanieVisitor;

public class Dog extends Animal {

    public Dog() {
        super(10, 2, 3);
    }

    @Override
    void accept(HotelStaff hotelStaff) {
        hotelStaff.takeCare(this);
    }
}
