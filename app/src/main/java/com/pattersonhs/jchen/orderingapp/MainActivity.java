package com.pattersonhs.jchen.orderingapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pizzaHut;
    Button pizzaButton;
    Button wingsButton;
    Button drinksButton;
    RadioGroup typeOfPizza;
    RadioGroup cheese;
    RadioGroup size;
    RadioGroup

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizzaHut = (TextView) findViewById(R.id.pizzaHut);
        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        wingsButton = (Button) findViewById(R.id.wingsButton);
        drinksButton = (Button) findViewById(R.id.drinksButton);
        typeOfPizza = (RadioGroup) findViewById(R.id.typeOfPizza);
        cheese = (RadioGroup) findViewById(R.id.cheese);
        size = (RadioGroup) findViewById(R.id.size);

        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            typeOfPizza.setVisibility(View.VISIBLE);
            cheese.setVisibility(View.VISIBLE);
            size.setVisibility(View.VISIBLE);
            }
        });
    }
}
