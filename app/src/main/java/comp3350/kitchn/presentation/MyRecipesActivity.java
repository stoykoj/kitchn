package comp3350.kitchn.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import comp3350.kitchn.R;

/**
 * Created by Steven Powell on 2/8/2017.
 */

public class MyRecipesActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes_layout);
    }
}
