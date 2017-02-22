package comp3350.kitchn.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Steven Powell on 2/8/2017.
 */

public class Recipe {
    private String title = "";
    private ArrayList<Ingredient> ingredients;
    private ArrayList<String> steps;

    public Recipe(String newTitle) {
        if (newTitle != null)
            title = newTitle;
        ingredients = new ArrayList<>();
        steps = new ArrayList<>();
    }

    public void addIngredient(Ingredient i) {
        if (i != null)
            ingredients.add(i);
    }

    public void addStep(String s) {
        if (s != null && !s.equals(""))
            steps.add(s);
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public String toString() {
        String result = title;
        if (ingredients.size() >0) {
            result += "\nIngredients\n";
            for (int i = 0; i < ingredients.size(); i++) {
                result += ingredients.get(i).toString() +"\n";
            }
            if (steps.size() > 0){
                result += "Steps\n";
                for (int j=0; j < steps.size(); j++){
                    result += (j+1) +". " +steps.get(j) +"\n";
                }
            }
        }
        return result;
    }
}
