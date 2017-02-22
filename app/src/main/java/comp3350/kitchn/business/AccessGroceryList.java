package comp3350.kitchn.business;

/**
 * Created by Steven Powell on 2/8/2017.
 */

import java.util.List;

import comp3350.kitchn.application.MainActivity;
import comp3350.kitchn.application.Services;
import comp3350.kitchn.objects.Ingredient;
import comp3350.kitchn.persistence.DataAccessStub;

public class AccessGroceryList {

    private DataAccessStub dataAccess;
    private List<Ingredient> ingredients ;
    private int currentIngredient;

    public AccessGroceryList()
    {
        dataAccess = (DataAccessStub) Services.getDataAccess(MainActivity.dbName);
        ingredients = null;
        currentIngredient = 0;
    }

    public String getGroceryListItems(List<Ingredient> ingredients)
    {
        ingredients.clear();
        return dataAccess.getGroceryListItemsSequential(ingredients);
    }


    public String insertGroceryListItem(Ingredient currentIngredient)
    {
        return dataAccess.insertGroceryListItem(currentIngredient);
    }

    public String updateGroceryListItem(Ingredient currentIngredient)
    {
        return dataAccess.updateGroceryListItem(currentIngredient);
    }

    public String deleteGroceryListItem(Ingredient currentIngredient)
    {
        return dataAccess.deleteGroceryListItem(currentIngredient);
    }
}
