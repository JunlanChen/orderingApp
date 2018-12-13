package com.pattersonhs.jchen.orderingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Receipt extends AppCompatActivity {

    Button sendButton;
    TextView pizzaButton;
    TextView wingsButton;
    TextView drinksButton;
    TextView typePepperoni;
    TextView typeChicken;
    TextView typeBeef;
    TextView normalCheese;
    TextView extraCheese;
    TextView inch12;
    TextView inch16;
    TextView bbqWings;
    TextView buffaloWings;
    TextView obeyWings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        sendButton = (Button) findViewById(R.id.sendButton);
        pizzaButton = (TextView) findViewById(R.id.pizzaButton);
        wingsButton = (TextView) findViewById(R.id.wingsButton);
        drinksButton = (TextView) findViewById(R.id.drinksButton);
        typePepperoni = (TextView) findViewById(R.id.typePepperoni);
        typeChicken = (TextView) findViewById(R.id.typeChicken);
        typeBeef = (TextView) findViewById(R.id.typeBeef);
        normalCheese = (TextView) findViewById(R.id.normalCheese);
        extraCheese = (TextView) findViewById(R.id.extraCheese);
        inch12 = (TextView) findViewById(R.id.inch12);
        inch16 = (TextView) findViewById(R.id.inch16);
        bbqWings = (TextView) findViewById(R.id.bbqWings);
        buffaloWings = (TextView) findViewById(R.id.buffaloWings);
        obeyWings = (TextView) findViewById(R.id.obeyWings);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(Intent.ACTION_VIEW)
                        .setType("plain/text")
                        .setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail")
                        .putExtra(Intent.EXTRA_EMAIL, new String[]{"junlanchen0128@gmail.com"})
                        .putExtra(Intent.EXTRA_SUBJECT, "Orders")
                        .putExtra(Intent.EXTRA_TEXT, "" + pizzaButton.getText().toString() + ", "+ wingsButton.getText().toString()+ ", " + drinksButton.getText().toString()+ ", " + typePepperoni.getText().toString() + ", "+ typeBeef.getText().toString() + ", " + typeChicken.getText().toString()+ ", " + normalCheese.getText().toString() + ", "+ extraCheese.getText().toString() + ", "+ inch12.getText().toString() + ", " + inch16.getText().toString() + ", " + bbqWings.getText().toString() + ", "+ buffaloWings.getText().toString() + ", "+ obeyWings.getText().toString() );
                startActivity(intent);
            }
        });
    }
}
//