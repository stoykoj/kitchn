//adding a comment to try VC

// Steven Powell - test
//Riley made this comment at 8:36 on 2/9/2017
// Julia (11:12 10/2/2017)
// Joshua commented here at some point
package comp3350.kitchn.application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import comp3350.kitchn.R;
import comp3350.kitchn.presentation.GroceryListActivity;
import comp3350.kitchn.presentation.MyRecipesActivity;
import comp3350.kitchn.presentation.PantryActivity;

public class MainActivity extends AppCompatActivity {

    public static final String dbName="data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public static void startUp()
    {
        Services.createDataAccess(dbName);
    }

    public static void shutDown()
    {
        Services.closeDataAccess();
    }

    public void goGroceryList(View view){
        startActivity(new Intent(this, GroceryListActivity.class));
    }
    public void goRecipes(View view){
        startActivity(new Intent(this, MyRecipesActivity.class));
    }
    public void goPantry(View view){
        startActivity(new Intent(this, PantryActivity.class));
    }
}
