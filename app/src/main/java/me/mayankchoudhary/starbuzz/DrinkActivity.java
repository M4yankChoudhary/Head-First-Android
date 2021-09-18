package me.mayankchoudhary.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView title, desc;
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinkID = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
        Drink drink = Drink.drinks[drinkID];
        imageView = findViewById(R.id.drinkImage);
        title = findViewById(R.id.drinkTitle);
        desc = findViewById(R.id.drinkDesc);

        imageView.setImageResource(drink.getImageResID());
        title.setText(drink.getName());
        desc.setText(drink.getDescription());
    }
}