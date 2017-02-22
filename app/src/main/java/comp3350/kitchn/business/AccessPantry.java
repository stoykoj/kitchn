package comp3350.kitchn.business;

/**
 * Created by Steven Powell on 2/8/2017.
 */
import java.util.List;

import comp3350.kitchn.application.MainActivity;
import comp3350.kitchn.application.Services;
import comp3350.kitchn.objects.Ingredient;
import comp3350.kitchn.persistence.DataAccessStub;


public class AccessPantry {
    private DataAccessStub dataAccess;
    private List<Ingredient> ingredients ;
    private int currentIngredient;

    public AccessPantry()
    {
        dataAccess = (DataAccessStub) Services.getDataAccess(MainActivity.dbName);
        ingredients = null;
        currentIngredient = 0;
    }

    public String getPantryItems(List<Ingredient> ingredients)
    {
        ingredients.clear();
        return dataAccess.getPantryItemsSequential(ingredients);
    }


    public String insertPantryItem(Ingredient currentIngredient)
    {
        return dataAccess.insertPantryItem(currentIngredient);
    }

    public String updatePantryItem(Ingredient currentIngredient)
    {
        return dataAccess.updatePantryItem(currentIngredient);
    }

    public String deletePantryItem(Ingredient currentIngredient)
    {
        return dataAccess.deletePantryItem(currentIngredient);
    }

}
