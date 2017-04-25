package zadanieVisitor;

public class Cleaner extends HotelStaff {
    @Override
    public void takeCare(Parrot parrot) {
        System.out.println("Cleaning parrot");
        cleanAnimal(parrot);
    }

    @Override
    public void takeCare(Dog dog) {
        System.out.println("Cleaning dog");
        cleanAnimal(dog);
    }

    @Override
    public void takeCare(Cat cat) {
        System.out.println("Cleaning cat");
        cleanAnimal(cat);
    }

    private void cleanAnimal(Animal animal) {
        int cleanness = animal.getCleaness();
        animal.setCleaness(cleanness + 1);
    }
}
