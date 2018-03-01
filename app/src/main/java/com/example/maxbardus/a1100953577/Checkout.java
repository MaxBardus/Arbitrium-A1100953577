package com.example.maxbardus.a1100953577;
// Maksym Bardus
// ID: 100953577
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.security.spec.ECField;

public class Checkout extends AppCompatActivity {
    // Properties
    private ImageButton infoButtonC;
    private EditText firstName;
    private EditText lastName;
    private EditText addressText;
    private EditText creditCart;
    private EditText instructonText;
    private Button orderButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        // info button
        infoButtonC = (ImageButton) findViewById(R.id.infoButtonC);
        infoButtonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Fill yor identity information;)", Toast.LENGTH_LONG).show();
            }

        });
        // setting up edit text fields
        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        addressText = (EditText) findViewById(R.id.addressText);
        creditCart = (EditText) findViewById(R.id.creditCart);
        instructonText = (EditText) findViewById(R.id.instructionsText);
        orderButton = (Button) findViewById(R.id.orderButton);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = firstName.getText().toString();
                if(fname.isEmpty()){
                    firstName.setError("This field cannot be empty");
                    return;
                }
                String lname = lastName.getText().toString();
                if (lname.isEmpty()){
                    lastName.setError("This field cannot be empty");
                }
                String address = addressText.getText().toString();
                if (address.isEmpty()){
                    addressText.setError("Please enter your address");
                    return;
                }
                String creditcart = creditCart.getText().toString();
                if(!isValidCart(creditcart)){
                    creditCart.setError("Invalid Cart");
                    return;
                }
                String instruction = instructonText.getText().toString();
                placeOrder(fname, lname, address, creditcart, instruction);
            }
        });


    }

 // button methods
private void placeOrder(String fname, String lname, String address, String creditcart, String instruction){
    Intent intent = new Intent(this, orderReview.class);
    intent.putExtra("firstname", fname);
    intent.putExtra("lastname", lname);
    intent.putExtra("address", address);
    intent.putExtra("creditcart", creditcart);
    intent.putExtra(("specialinstruction"), instruction);
    startActivity(intent);
}
// Validation Method
private boolean isValidCart(String creditcart){
    if (creditcart != null && creditcart.length() > 15){
        return true;
    }
    return false;
}




}
