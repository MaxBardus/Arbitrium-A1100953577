package com.example.maxbardus.a1100953577;
// Maksym Bardus
// ID: 100953577
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class italianCuisine extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    // Properties
    private Button backButton2;
    private ImageButton infoButton2;
    private Button submitRestaurant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_cuisine);
        //Submit Button
        submitRestaurant = (Button) findViewById(R.id.submitRestaurant);
        // back button
        backButton2 = (Button) findViewById(R.id.backButton2);
        backButton2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                goBack();
            }
        });
        // info button
        infoButton2 = (ImageButton) findViewById(R.id.infoButton2);
        infoButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Here you can choose the Italian restaurant you like", Toast.LENGTH_LONG).show();
            }

        });

        // Spinner
        Spinner mySpinner= (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(italianCuisine.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.italian));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);


        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                switch (pos){
                    case 0: {
                        submitRestaurant.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                goTerraPizza();
                            }
                        });
                    }
                    break;
                    case 1: {
                        submitRestaurant.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                goEdenPasta();
                            }
                        });
                    }
                    break;
                    case 2: {
                        submitRestaurant.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                goDeonis();
                            }
                        });
                    }
                    break;


                }
            }
            @Override
            public void  onNothingSelected(AdapterView<?> parent){

            }

        });

    }




    // methods for buttons
    private void goBack() {
        Intent intent = new Intent(this, kitchenActivity.class);
        startActivity(intent);
    }
    private  void goTerraPizza(){
        Intent intent = new Intent(this, terrapizzaMenu.class);
        startActivity(intent);
    }
    private void goEdenPasta(){
        Intent intent = new Intent(this, edenpastaMenu.class);
        startActivity(intent);
    }
    private void goDeonis(){
        Intent intent = new Intent(this, deonisMenu.class);
        startActivity(intent);
    }

// Doesn't do anything
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
