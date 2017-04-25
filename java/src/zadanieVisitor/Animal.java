package zadanieVisitor;

public abstract class Animal {
    private int hunger;
    private int comfort;
    private int cleaness;

    public Animal(int hunger, int comfort, int cleaness) {
        this.hunger = hunger;
        this.comfort = comfort;
        this.cleaness = cleaness;
    }

    abstract void accept(HotelStaff hotelStaff);

    public int getCleaness() {
        return cleaness;
    }

    public int getComfort() {
        return comfort;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setComfort(int comfort) {
        this.comfort = comfort;
    }

    public void setCleaness(int cleaness) {
        this.cleaness = cleaness;
    }
}
