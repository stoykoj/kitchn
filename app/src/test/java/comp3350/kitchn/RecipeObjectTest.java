package comp3350.kitchn;

import org.junit.*;
import java.util.ArrayList;
import static junit.framework.Assert.*;

import comp3350.kitchn.objects.*;
import comp3350.kitchn.business.*;

public class RecipeObjectTest {

    private static Recipe testRecipe;
    private static Ingredient flour;
    private static Ingredient sugar;
    private static Ingredient salt;
    private static Ingredient bakingSoda;
    private static Ingredient egg;
    private static String step1;
    private static String step2;
    private static String step3;

    @BeforeClass
    public static void setUpNewRecipe() {
        flour = new Ingredient("Flour", "1 cup");
        sugar = new Ingredient("Sugar", "0.5 cup");
        salt = new Ingredient("Salt", "1 tsp");
        bakingSoda = new Ingredient("Baking Soda", "0.25 tsp");
        egg = new Ingredient("Egg", "2");

        testRecipe = new Recipe("Test");
        testRecipe.addIngredient(flour);
        testRecipe.addIngredient(sugar);
        testRecipe.addIngredient(salt);
        testRecipe.addIngredient(bakingSoda);
        testRecipe.addIngredient(egg);

        step1 = "Preheat oven";
        step2 = "Mix ingredients";
        step3 = "Bake until brown";
        testRecipe.addStep(step1);
        testRecipe.addStep(step2);
        testRecipe.addStep(step3);
    }

    @Test
    public void testValidTitle() {
        Recipe validRecipe = new Recipe("Valid Recipe");
        assertEquals("Valid Recipe", validRecipe.toString());
    }

    @Test
    public void testEmptyTitle() {
        Recipe emptyRecipe = new Recipe("");
        assertEquals("", emptyRecipe.toString());
    }

    @Test
    public void testNullTitle() {
        Recipe nullRecipe = new Recipe(null);
        assertEquals("", nullRecipe.toString());
    }

    @Test
    public void testCheckIngredientList() {
        ArrayList<Ingredient> igList = testRecipe.getIngredients();
        assertEquals("0.5 cup of Sugar", igList.get(1).toString());
        assertEquals("Flour", igList.get(0).getName());
        assertEquals("2", igList.get(4).getAmount());
    }

    @Test
    public void testCheckStepList() {
        ArrayList<String> stepList = testRecipe.getSteps();
        assertEquals("Mix ingredients", stepList.get(1));
    }

    @Test
    public void testAddValidIngredient() {
        testRecipe.addIngredient(new Ingredient("Butter", "200 grams"));
        assertEquals("200 grams of Butter", testRecipe.getIngredients().get(5).toString());
    }

    @Test
    public void testAddValidStep() {
        int ogListSize = testRecipe.getSteps().size();
        testRecipe.addStep("This should add one more element to recipe");
        assertEquals(ogListSize + 1, testRecipe.getSteps().size());
    }

    @Test
    public void testAddEmptyStep() {
        int ogListSize = testRecipe.getSteps().size();
        testRecipe.addStep("");
        assertEquals(ogListSize, testRecipe.getSteps().size());
    }

    @Test
    public void testAddNullStep() {
        int ogListSize = testRecipe.getSteps().size();
        testRecipe.addStep(null);
        assertEquals(ogListSize, testRecipe.getSteps().size());
    }
}
