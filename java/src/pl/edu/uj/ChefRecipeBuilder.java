package pl.edu.uj;

public class ChefRecipeBuilder extends Builder {
    private ChefRecipe instance;

    public ChefRecipeBuilder() {
        this.instance = new ChefRecipe();
    }

    @Override
    public void buildMeat(int amount) {
        instance.addPosition("meat " + amount + " gramms");
    }

    @Override
    public void buildSauce(String sauceType) {
        instance.addPosition("sauce: " + sauceType);
    }

    @Override
    public void buildBread() {
        instance.addPosition("bread");
    }

    @Override
    public void buildSalad() {
        instance.addPosition("salad");
    }

    @Override
    public void buildCheese() {
        instance.addPosition("cheese");
    }

    public ChefRecipe getChefRecipe() {
        return instance;
    }
}
