package com.example.maxbardus.a1100953577;
// Maksym Bardus
// ID: 100953577
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class chidoriMenu extends AppCompatActivity {

    // Properties
    private ImageButton infoButtonCh;
    private Button backButtonCh;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private Button checkoutChidori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terrapizza_menu);

        // setting up info button
        infoButtonCh = (ImageButton) findViewById(R.id.infoButtonCh);
        infoButtonCh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Check out awesome menu of Chidori restaurant", Toast.LENGTH_LONG).show();
            }

        });
        // setting up back button
        backButtonCh = (Button) findViewById(R.id.backButtonI);
        backButtonCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
        //setting up proceed to checkout button
        checkoutChidori = (Button) findViewById(R.id.checkoutChidori);
        // setting checkboxes
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            // sending data from checkboxes
            @Override
            public void onClick(View view) {
                checkoutChidori.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        goCheckout();
                    }
                });
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkoutChidori.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        goCheckout();
                    }
                });
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkoutChidori.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        goCheckout();
                    }
                });
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkoutChidori.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        goCheckout();
                    }
                });
            }
        });







    }

    // button methods
    private void goBack() {
        Intent intent = new Intent(this, japaneseCuisine.class);
        startActivity(intent);
    }
    private void goCheckout(){
        Intent intent = new Intent(this, Checkout.class);
        startActivity(intent);
    }



}