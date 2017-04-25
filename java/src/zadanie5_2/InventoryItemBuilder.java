package zadanie5_2;

public class InventoryItemBuilder extends Builder {
    private InventoryItem instance;

    public InventoryItemBuilder() {
        this.instance = new InventoryItem();
    }

    @Override
    public void buildMeat(int amount) {
        this.instance.addMeat(amount);
    }

    @Override
    public void buildSauce(String sauceType) {
        this.instance.addSauce();
    }

    @Override
    public void buildBread() {
        this.instance.addBread();
    }

    @Override
    public void buildSalad() {
        this.instance.addSalad();
    }

    @Override
    public void buildCheese() {
        this.instance.addCheese();
    }

    public InventoryItem getInventoryItem() {
        return this.instance;
    }
}
