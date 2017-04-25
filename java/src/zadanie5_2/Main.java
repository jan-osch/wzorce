package zadanie5_2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("test 1");
        test1();
        System.out.println();
        System.out.println("test 2");
        test2();
    }

    private static void test1() {
        ChefRecipeBuilder crBuilder = new ChefRecipeBuilder();
        Director director = new Director(crBuilder);

        try {
            director.construct("hamburger.recipe");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        ChefRecipe cp = crBuilder.getChefRecipe();
        cp.show();
    }

    private static void test2() {
        InventoryItemBuilder builder = new InventoryItemBuilder();
        Director director = new Director(builder);

        try {
            director.construct("doubleburger.recipe");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        InventoryItem i = builder.getInventoryItem();
        i.show();
    }
}
