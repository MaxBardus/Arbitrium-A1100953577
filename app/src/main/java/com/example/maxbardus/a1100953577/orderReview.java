package com.example.maxbardus.a1100953577;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class orderReview extends AppCompatActivity {
    // Properties
    private TextView userName;
    private TextView userLName;
    private TextView userAddress;
    private TextView instructionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_review);

        Toast.makeText(getBaseContext(), "Your order is confirmed", Toast.LENGTH_LONG).show();
        // setting up text views
        userName = (TextView) findViewById(R.id.userName);
        userLName = (TextView) findViewById(R.id.userLName);
        userAddress = (TextView) findViewById(R.id.userAddress);
        instructionView = (TextView) findViewById(R.id.instructionsView);

        // getting data for textviews
            userName.setText(getIntent().getExtras().getString("firstname"));
            userLName.setText(getIntent().getExtras().getString("lastname"));
            userAddress.setText(getIntent().getExtras().getString("address"));
            instructionView.setText(getIntent().getExtras().getString("specialinstruction"));
    }
}
