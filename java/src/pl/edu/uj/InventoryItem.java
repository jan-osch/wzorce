package pl.edu.uj;

public class InventoryItem implements Presentable {
    private int meatAmount;
    private int saladAmount;
    private int breadAmount;
    private int sauceAmount;
    private int cheeseAmount;

    public InventoryItem() {
        this.meatAmount = 0;
        this.saladAmount = 0;
        this.breadAmount = 0;
        this.sauceAmount = 0;
        this.cheeseAmount = 0;
    }

    public void addMeat(int amount) {
        this.meatAmount += amount;
    }

    public void addSalad() {
        this.saladAmount++;
    }

    public void addBread() {
        this.breadAmount++;
    }

    public void addSauce() {
        this.sauceAmount++;
    }

    public void addCheese() {
        this.cheeseAmount++;
    }

    @Override
    public void show() {
        System.out.println("Inventory Item ");
        System.out.println("meat: " + this.meatAmount);
        System.out.println("salad: " + this.saladAmount);
        System.out.println("bread: " + this.breadAmount);
        System.out.println("sauce: " + this.sauceAmount);
        System.out.println("cheese: " + this.cheeseAmount);
    }
}
