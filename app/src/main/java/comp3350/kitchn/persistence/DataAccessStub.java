package comp3350.kitchn.persistence;

/**
 * Created by Steven Powell on 2/8/2017.
 */
import java.util.ArrayList;
import java.util.List;

import comp3350.kitchn.application.MainActivity;
import comp3350.kitchn.objects.Ingredient;
import comp3350.kitchn.objects.Recipe;

public class DataAccessStub {


    private String dbName;
    private String dbType = "stub";

    private ArrayList<Ingredient> pantryItems;
    private ArrayList<Ingredient> groceryListItems;
    private ArrayList<Recipe> recipes;

    public DataAccessStub(String dbName)
    {
        this.dbName = dbName;
    }


    public DataAccessStub()
    {
        this(MainActivity.dbName);
    }


    public void open(String dbName)
    {
        Ingredient ingredient;
        Recipe recipe;



        pantryItems = new ArrayList<Ingredient>();
        ingredient = new Ingredient("Milk", "2 jugs");
        pantryItems.add(ingredient);
        ingredient = new Ingredient("Brown Sugar", "");
        pantryItems.add(ingredient);
        ingredient = new Ingredient("Sugar", "4 cups");
        pantryItems.add(ingredient);
        ingredient = new Ingredient("Franks Red Hot", "375 ml");
        pantryItems.add(ingredient);

        groceryListItems = new ArrayList<Ingredient>();
        ingredient = new Ingredient("Salt", "5 pounds");
        groceryListItems.add(ingredient);
        ingredient = new Ingredient("Oil", "500 ml");
        groceryListItems.add(ingredient);
        ingredient = new Ingredient("Eggs", "dozen");
        groceryListItems.add(ingredient);

        recipes = new ArrayList<Recipe>();
        recipe = new Recipe("Fried Egg Sandwich");
        recipe.addIngredient(new Ingredient("Egg", "2"));
        recipe.addIngredient(new Ingredient("Bread","2"));
        recipe.addIngredient(new Ingredient("Cheese"));
        recipe.addIngredient(new Ingredient("Butter"));
        recipe.addIngredient(new Ingredient("Ketchup"));
        recipe.addStep("Fry the eggs on high until the yolk is over medium.");
        recipe.addStep("Grate the cheese.");
        recipe.addStep("Toast the bread.");
        recipe.addStep("Butter both sides of the bread.");
        recipe.addStep("Place both eggs on a piece of toast, add the ketchup, the cheese, and then the other piece of toast.");
        recipes.add(recipe);


        recipe = new Recipe("Mac and Cheese");
        recipe.addIngredient(new Ingredient("Macaroni", "200 grams"));
        recipe.addIngredient(new Ingredient("Cheese Powder"));
        recipe.addIngredient(new Ingredient("Butter"));
        recipe.addIngredient(new Ingredient("Milk", "half cup milk"));
        recipe.addStep("Boil water in a pot.");
        recipe.addStep("Add macaroni to the water.");
        recipe.addStep("Cook the macaroni until it is soft");
        recipe.addStep("Strain the water from the macaroni");
        recipe.addStep("Add butter, milk and cheese");
        recipes.add(recipe);


        System.out.println("Opened " +dbType +" database " +dbName);


    }
    public void close()
    {
        System.out.println("Closed " +dbType +" database " +dbName);
    }

    public String getRecipeSequential(List<Recipe> recipeResult)
    {
        recipeResult.addAll(recipes);
        return null;
    }
    public String insertRecipe(Recipe currentRecipe)
    {
        recipes.add(currentRecipe);
        return null;
    }
    public String updateRecipe(Recipe currentRecipe)
    {
        int index;

        index = recipes.indexOf(currentRecipe);
        if (index >= 0)
        {
            recipes.set(index, currentRecipe);
        }
        return null;
    }

    public String deleteRecipe(Recipe currentRecipe)
    {
        int index;

        index = recipes.indexOf(currentRecipe);
        if (index >= 0)
        {
            recipes.remove(index);
        }
        return null;
    }






    public String getPantryItemsSequential(List<Ingredient> ingredientsResult)
    {
        ingredientsResult.addAll(pantryItems);
        return null;
    }
    public String insertPantryItem(Ingredient currentIngredient)
    {
        pantryItems.add(currentIngredient);
        return null;
    }
    public String updatePantryItem(Ingredient currentIngredient)
    {
        int index;

        index = pantryItems.indexOf(currentIngredient);
        if (index >= 0)
        {
            pantryItems.set(index, currentIngredient);
        }
        return null;
    }

    public String deletePantryItem(Ingredient currentIngredient)
    {
        int index;

        index = pantryItems.indexOf(currentIngredient);
        if (index >= 0)
        {
            pantryItems.remove(index);
        }
        return null;
    }





    public String getGroceryListItemsSequential(List<Ingredient> ingredientsResult)
    {
        ingredientsResult.addAll(groceryListItems);
        return null;
    }
    public String insertGroceryListItem(Ingredient currentIngredient)
    {
        groceryListItems.add(currentIngredient);
        return null;
    }
    public String updateGroceryListItem(Ingredient currentIngredient)
    {
        int index;

        index = groceryListItems.indexOf(currentIngredient);
        if (index >= 0)
        {
            groceryListItems.set(index, currentIngredient);
        }
        return null;
    }

    public String deleteGroceryListItem(Ingredient currentIngredient)
    {
        int index;

        index = groceryListItems.indexOf(currentIngredient);
        if (index >= 0)
        {
            groceryListItems.remove(index);
        }
        return null;
    }

}

