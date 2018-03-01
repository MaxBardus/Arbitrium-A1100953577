package com.example.maxbardus.a1100953577;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
// Maksym Bardus
// ID: 100953577
public class japaneseCuisine extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // Properties
    private Button submitRestaurantJ;
    private ImageButton infoButtonJap;
    private Button backButtonJap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese_cuisine);
        // back button
        backButtonJap = (Button) findViewById(R.id.backButtonJap);
        backButtonJap.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                goBack();
            }
        });
        // info button
        infoButtonJap = (ImageButton) findViewById(R.id.infoButtonJap);
        infoButtonJap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Here you can choose the Japanese restaurant you like", Toast.LENGTH_LONG).show();
            }

        });
        submitRestaurantJ = (Button) findViewById(R.id.submitRestaurantJ);
        // Spinner
        Spinner mySpinner2= (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(japaneseCuisine.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.japanese));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);


        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                switch (pos){
                    case 0: {
                        submitRestaurantJ.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                goRasengan();
                            }
                        });
                    }
                    break;
                    case 1: {
                        submitRestaurantJ.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                goChidori();
                            }
                        });
                    }
                    break;
                    case 2: {
                        submitRestaurantJ.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                goEdoTensei();
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
    private  void goRasengan(){
        Intent intent = new Intent(this, rasenganMenu.class);
        startActivity(intent);
    }
    private void goChidori(){
        Intent intent = new Intent(this, chidoriMenu.class);
        startActivity(intent);
    }
    private void goEdoTensei(){
        Intent intent = new Intent(this, edotenseiMenu.class);
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
