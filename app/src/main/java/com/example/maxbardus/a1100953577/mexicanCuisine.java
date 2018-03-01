package com.example.maxbardus.a1100953577;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class mexicanCuisine extends AppCompatActivity {

    //Properties
    private ImageButton infoButton4;
    private Button backButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexican_cuisine);
        // back button
        backButton4 = (Button) findViewById(R.id.backButton4);
        backButton4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                goBack();
            }
        });


        // info button
        infoButton4 = (ImageButton) findViewById(R.id.infoButton4);
        infoButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Here you can choose the Mexican restaurant you like", Toast.LENGTH_LONG).show();
            }

        });



    }


    // methods for buttons
    private void goBack() {
        Intent intent = new Intent(this, kitchenActivity.class);
        startActivity(intent);
    }
}
