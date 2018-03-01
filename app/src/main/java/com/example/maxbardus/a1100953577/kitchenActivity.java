package com.example.maxbardus.a1100953577;
// Maksym Bardus
// ID: 100953577
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class kitchenActivity extends AppCompatActivity {

    // Properties
    private Button backButton;
    private ImageButton infoButton1;
    private Button nextButton;
    private TextView italianHyperlink;
    private TextView japaneseHyperlink;
    private TextView mexicanHyperlink;
    private RadioGroup chooseKitchen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
        nextButton = (Button) findViewById(R.id.nextButton);
        // setting up back button
        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                goBack();
            }
            });
            // setting up info button
        infoButton1 = (ImageButton) findViewById(R.id.infoButton1);
        infoButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Here you can choose the kitchen you like and learn more about it", Toast.LENGTH_LONG).show();
            }

        });
        // Choosing cuisine

        chooseKitchen = (RadioGroup) findViewById(R.id.chooseKitchen);
        chooseKitchen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch(i){
                    case R.id.radioButtonItalian: {
                        nextButton.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                goItalianRestaurant();
                            }
                        });
                    }
                    break;
                    case R.id.radioButtonJapanese: {
                        nextButton.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v){
                                goJapaneseRestaurant();
                            }
                        });
                    }
                    break;
                    case R.id.radioButtonMexican: {
                        nextButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                goMexicanRestaurant();
                            }
                        });
                    }
                    break;



                }




            }
        });













        // Links To Web
        /*
        italianHyperlink = (TextView) findViewById(R.id.italianHyperlink);
        italianHyperlink.setClickable(true);
        italianHyperlink.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://en.wikipedia.org/wiki/Italian_cuisine>Italian</a>'";
        italianHyperlink.setText(Html.fromHtml(text));

*/
    }

    // methods for buttons
    private void goBack() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    private void goItalianRestaurant() {
        Intent intent = new Intent(this, italianCuisine.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out); // Transition animation

    }
    private void goJapaneseRestaurant(){
        Intent intent = new Intent(this, japaneseCuisine.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out); // Transition animation

    }
    private void goMexicanRestaurant(){
        Intent intent = new Intent(this, mexicanCuisine.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out); // Transition animation

    }


}
