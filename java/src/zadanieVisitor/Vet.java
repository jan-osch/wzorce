package zadanieVisitor;

public class Vet extends HotelStaff {

    private static final int comfortThreshold = 1;
    private static final int cleannessThreshold = 2;

    @Override
    public void takeCare(Parrot parrot) {
        this.takeCareOfAnimal(parrot);
    }

    @Override
    public void takeCare(Dog dog) {
        this.takeCareOfAnimal(dog);
    }

    @Override
    public void takeCare(Cat cat) {
        this.takeCareOfAnimal(cat);
    }

    private void takeCareOfAnimal(Animal animal) {
        int comfort = animal.getComfort();
        int cleanness = animal.getCleaness();
        boolean isUnhappy = comfort < comfortThreshold;
        boolean isDirty = cleanness < cleannessThreshold;

        if (isDirty || isUnhappy) {
            System.out.println("Vet here: animal is not well taken care of!!!");
        }
    }
}
