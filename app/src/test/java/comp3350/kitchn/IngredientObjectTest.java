package comp3350.kitchn;

import org.junit.*;
import static junit.framework.Assert.*;
import comp3350.kitchn.objects.*;
import comp3350.kitchn.business.*;

public class IngredientObjectTest {

    public Ingredient butterOneCup;
    public Ingredient butterNoAmnt;
    public Ingredient butterLowerCase;
    public Ingredient nullName;

    @Before
    public void makeValidIngredients() {
        butterOneCup = new Ingredient("Butter", "1 cup");
        butterNoAmnt = new Ingredient("Butter");
        butterLowerCase = new Ingredient("butter");
        nullName = new Ingredient(null);
    }

    @Test
    public void testValidIngredient() {
        assertEquals("1 cup Butter", butterOneCup.toString());
    }

    @Test
    public void testValidIngredientNoAmount() {
        assertEquals("Butter", butterNoAmnt.toString());
    }

    @Test
    public void testNullIngredientName() {
        assertEquals("", nullName.toString());
    }

    @Test
    public void testEqualsMethod() {
        assertTrue(butterOneCup.equalName(butterNoAmnt));
        assertFalse(butterOneCup.equalName(butterLowerCase));
    }

    @Test
    public void testEqualsInvalidData() {
        assertFalse(butterOneCup.equalName(nullName));
    }
}
