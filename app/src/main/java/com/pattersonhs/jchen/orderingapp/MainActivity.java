package com.pattersonhs.jchen.orderingapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView pizzaHut;
    TextView price;
    Button pizzaButton;
    Button wingsButton;
    Button drinksButton;
    Button submitButton;
    RadioGroup typeOfPizza;
    RadioGroup cheese;
    RadioGroup size;
    RadioGroup typeOfWings;
    RadioGroup wingSize;
    RadioGroup soda;
    RadioGroup drinkSize;
    RadioButton typePepperoni;
    RadioButton typeChicken;
    RadioButton typeBeef;
    RadioButton extraChesse;
    RadioButton normalCheese;
    RadioButton inch12;
    RadioButton inch16;
    RadioButton bbqWings;
    RadioButton buffaloWings;
    RadioButton obeyWings;
    RadioButton sixPieceWings;
    RadioButton twelvePieceWings;
    RadioButton coke;
    RadioButton sprite;
    RadioButton orange;
    RadioButton small;
    RadioButton large;
    String currentPrice;
    double intPrice;
    double newIntPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizzaHut = (TextView) findViewById(R.id.pizzaHut);
        price = (TextView) findViewById(R.id.price);
        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        wingsButton = (Button) findViewById(R.id.wingsButton);
        submitButton = (Button) findViewById(R.id.submitButton);
        drinksButton = (Button) findViewById(R.id.drinksButton);
        typeOfPizza = (RadioGroup) findViewById(R.id.typeOfPizza);
        cheese = (RadioGroup) findViewById(R.id.cheese);
        size = (RadioGroup) findViewById(R.id.size);
        typeOfWings = (RadioGroup) findViewById(R.id.typeOfWings);
        wingSize = (RadioGroup) findViewById (R.id.wingSize);
        soda = (RadioGroup) findViewById(R.id.soda);
        drinkSize = (RadioGroup) findViewById(R.id.drinkSize);
        typePepperoni = (RadioButton) findViewById(R.id.typePepperoni);
        typeChicken = (RadioButton) findViewById(R.id.typeChicken);
        typeBeef = (RadioButton) findViewById(R.id.typeBeef);
        extraChesse = (RadioButton) findViewById(R.id.extraChesse);
        normalCheese = (RadioButton) findViewById(R.id.normalCheese);
        inch12 = (RadioButton) findViewById(R.id.inch12);
        inch16 = (RadioButton) findViewById(R.id.inch16);
        bbqWings = (RadioButton) findViewById(R.id.bbqWings);
        buffaloWings = (RadioButton) findViewById(R.id.buffaloWings);
        obeyWings = (RadioButton) findViewById(R.id.obeyWings);
        sixPieceWings = (RadioButton) findViewById(R.id.sixPieceWings);
        twelvePieceWings = (RadioButton) findViewById(R.id.twelvePieceWings);
        coke = (RadioButton) findViewById(R.id.coke);
        sprite = (RadioButton) findViewById(R.id.sprite);
        orange = (RadioButton) findViewById(R.id.orange);
        small = (RadioButton) findViewById(R.id.small);
        large = (RadioButton) findViewById(R.id.large);




        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            typeOfPizza.setVisibility(View.VISIBLE);
            cheese.setVisibility(View.VISIBLE);
            size.setVisibility(View.VISIBLE);
            typeOfWings.setVisibility(View.INVISIBLE);
            wingSize.setVisibility(View.INVISIBLE);
            soda.setVisibility(View.INVISIBLE);
            drinkSize.setVisibility(View.INVISIBLE);
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 8;
                currentPrice = "" + newIntPrice * 1.06 ;
                price.setText(currentPrice);
            }
        });
        wingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfWings.setVisibility(View.VISIBLE);
                wingSize.setVisibility(View.VISIBLE);
                typeOfPizza.setVisibility(View.INVISIBLE);
                cheese.setVisibility(View.INVISIBLE);
                soda.setVisibility(View.INVISIBLE);
                drinkSize.setVisibility(View.INVISIBLE);
                size.setVisibility(View.INVISIBLE);
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 6;
                currentPrice = "" + newIntPrice * 1.06;
                price.setText(currentPrice);
            }
        });
        drinksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soda.setVisibility(View.VISIBLE);
                drinkSize.setVisibility(View.VISIBLE);
                typeOfPizza.setVisibility(View.INVISIBLE);
                cheese.setVisibility(View.INVISIBLE);
                size.setVisibility(View.INVISIBLE);
                typeOfWings.setVisibility(View.INVISIBLE);
                wingSize.setVisibility(View.INVISIBLE);
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 2;
                currentPrice = "" + newIntPrice *1.06;
                price.setText(currentPrice);
            }
        });
        typePepperoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 2;
                currentPrice = "" + newIntPrice*1.06;
                price.setText(currentPrice);

            }
        });
        typeChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 3;
                currentPrice = "" + newIntPrice*1.06;
                price.setText(currentPrice);

            }
        });
        typeBeef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 3;
                currentPrice = "" + newIntPrice*1.06;
                price.setText(currentPrice);

            }
        });
        extraChesse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 2;
                currentPrice = "" + newIntPrice*1.06;
                price.setText(currentPrice);

            }
        });
        normalCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        inch12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice ;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        inch16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 4;
                currentPrice = "" + newIntPrice*1.06;
                price.setText(currentPrice);

            }
        });
        buffaloWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        bbqWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        obeyWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        sixPieceWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        twelvePieceWings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 6;
                currentPrice = "" + newIntPrice*1.06;
                price.setText(currentPrice);

            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        sprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice ;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        coke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice ;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice;
                currentPrice = "" + newIntPrice;
                price.setText(currentPrice);

            }
        });
        large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPrice = price.getText().toString();
                intPrice = Integer.parseInt(currentPrice);
                newIntPrice = intPrice + 1;
                currentPrice = "" + newIntPrice*1.06;
                price.setText(currentPrice);

            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent receipt = new Intent(MainActivity.this,Receipt.class);
                startActivity(receipt);
            }
        });
    }
}
