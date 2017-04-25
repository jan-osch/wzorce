package zadanieVisitor;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final List<HotelStaff> staff;
    private final List<Animal> animals;

    public Hotel() {
        this.staff = new ArrayList<HotelStaff>();
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal a) {
        this.animals.add(a);
    }

    public void addStaff(HotelStaff h) {
        this.staff.add(h);
    }

    public void morningPassage() {
        System.out.println("Morning passage:");

        for (Animal animal : this.animals) {
            for (HotelStaff hotelStaff : this.staff) {
                animal.accept(hotelStaff);
            }
        }

        System.out.println();
    }

    public void eveningPassage() {
        System.out.println("Evening passage:");

        for (Animal animal : this.animals) {
            for (HotelStaff hotelStaff : this.staff) {
                if (hotelStaff instanceof Cleaner) {
                    animal.accept(hotelStaff);
                }
            }
        }

        System.out.println();
    }
}
