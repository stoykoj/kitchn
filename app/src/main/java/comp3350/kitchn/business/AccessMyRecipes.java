package comp3350.kitchn.business;

/**
 * Created by Steven Powell on 2/8/2017.
 */
import java.util.List;

import comp3350.kitchn.application.MainActivity;
import comp3350.kitchn.application.Services;
import comp3350.kitchn.objects.Recipe;
import comp3350.kitchn.persistence.DataAccessStub;


public class AccessMyRecipes {

    private DataAccessStub dataAccess;
    private List<Recipe> recipes ;
    private Recipe recipe;
    private int currentRecipe;

    public AccessMyRecipes()
    {
        dataAccess = (DataAccessStub) Services.getDataAccess(MainActivity.dbName);
        recipes = null;
        recipe = null;
        currentRecipe = 0;
    }

    public String getRecipes(List<Recipe> recipes)
    {
        recipes.clear();
        return dataAccess.getRecipeSequential(recipes);
    }



    public String insertCourse(Recipe currentRecipe)
    {
        return dataAccess.insertRecipe(currentRecipe);
    }

    public String updateCourse(Recipe currentRecipe)
    {
        return dataAccess.updateRecipe(currentRecipe);
    }

    public String deleteRecipe(Recipe currentRecipe)
    {
        return dataAccess.deleteRecipe(currentRecipe);
    }
}
