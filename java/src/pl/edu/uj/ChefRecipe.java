package pl.edu.uj;

import java.util.ArrayList;
import java.util.List;

public class ChefRecipe implements Presentable {

    private List<String> positions;

    public ChefRecipe() {
        this.positions = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println("Chef Recipe:");

        int counter = 1;
        for (String position : this.positions) {
            System.out.println("Step #" + counter++ + " : " + position);
        }
    }

    protected void addPosition(String position) {
        this.positions.add(position);
    }
}
