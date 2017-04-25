package zadanieVisitor;

public class Walker extends HotelStaff {

    @Override
    public void takeCare(Dog dog) {
        System.out.println("Walking dog");
        increaseComfort(dog);
    }

    @Override
    public void takeCare(Cat cat) {
        System.out.println("Walking cat");
        increaseComfort(cat);
    }

    private void increaseComfort(Animal animal) {
        int previous = animal.getComfort();
        animal.setComfort(previous + 1);
    }
}
