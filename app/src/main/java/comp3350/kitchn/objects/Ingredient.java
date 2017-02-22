package comp3350.kitchn.objects;

/**
 * Created by Steven Powell on 2/8/2017.
 */

public class Ingredient {
    private String name;
    private String amount;

    public Ingredient(String newName, String newAmount) {
        name = newName;
        if (name == null)
            name = "";

        amount = newAmount;
        if (amount == null)
            amount = "";
    }

    public Ingredient(String newName) {
        name = newName;
        if (name == null)
            name = "";
        amount = "";
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public String toString() {
        String returnStr = name;
        if (!amount.equals(""))
            returnStr = amount + " " + name;
        return returnStr;
    }

    public boolean equalName(Object object) {
        boolean result;
        Ingredient i;
        result = false;
        if (object instanceof Ingredient){
            i = (Ingredient) object;
            if ((((i.getName() == null) && (name == null)) || (i.getName().equals(name)))){
                result = true;
            }
        }
        return result;
    }
}
