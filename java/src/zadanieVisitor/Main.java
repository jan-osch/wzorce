package zadanieVisitor;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.addAnimal(new Dog());
        hotel.addAnimal(new Cat());
        hotel.addAnimal(new Cat());
        hotel.addAnimal(new Cat());
        hotel.addAnimal(new Parrot());

        hotel.addStaff(new Cleaner());
        hotel.addStaff(new Walker());
        hotel.addStaff(new Feeder(200));

        hotel.morningPassage();
        hotel.eveningPassage();
    }
}
