package com.example.maxbardus.a1100953577;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

// Maksym Bardus
// ID: 100953577
public class Home extends AppCompatActivity {

    // Property Declarations
    private Button startButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startChoose();
            }

        });

    }
    // Moving to next Activity
    private void startChoose(){
        Intent intent = new Intent(this, kitchenActivity.class);

        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out); // Transition animation
    }



}
