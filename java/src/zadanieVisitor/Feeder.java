package zadanieVisitor;

public class Feeder extends HotelStaff {
    private int food;

    private static final int parrotFood = 1;
    private static final int catFood = 5;
    private static final int dogFood = 10;

    public Feeder(int food) {
        this.food = food;
    }

    @Override
    public void takeCare(Parrot parrot) {
        System.out.println("Feeding parrot");
        feedAnimal(parrot, parrotFood);
    }

    @Override
    public void takeCare(Dog dog) {
        System.out.println("Feeding dog");
        feedAnimal(dog, dogFood);
    }

    @Override
    public void takeCare(Cat cat) {
        System.out.println("Feeding cat");
        feedAnimal(cat, catFood);
    }

    private void feedAnimal(Animal animal, int amount) {
        int previous = animal.getHunger();
        animal.setHunger(previous - amount);
        this.food -= amount;
    }
}
