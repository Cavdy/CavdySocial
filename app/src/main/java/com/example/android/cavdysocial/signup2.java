package com.example.android.cavdysocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup2 extends AppCompatActivity {
    String fname;
    String lname;
    String occupationselect;
    String locationselect;
    String countryselect;
    EditText emailaddress;
    EditText phonenumber;
    EditText twitter;
    EditText facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        fname = getIntent().getStringExtra("FNAME");
        lname = getIntent().getStringExtra("LNAME");
        occupationselect = getIntent().getStringExtra("OCCUPATION");
        locationselect = getIntent().getStringExtra("LOCATION");
        countryselect = getIntent().getStringExtra("COUNTRY");
    }

    public void signup(View view) {
        emailaddress = (EditText) findViewById(R.id.emailaddress);
        String emailadd = emailaddress.getText().toString();
        phonenumber = (EditText) findViewById(R.id.phonenumber);
        String phonenum = phonenumber.getText().toString();
        twitter = (EditText) findViewById(R.id.twitter);
        String twitt = twitter.getText().toString();
        facebook = (EditText) findViewById(R.id.facebook);
        String faceb = facebook.getText().toString();

        if(emailadd != null && !emailadd.trim().isEmpty() && phonenum != null && !phonenum.trim().isEmpty() && twitt != null && !twitt.trim().isEmpty() && faceb != null && !faceb.trim().isEmpty()) {
            Intent signupfinal = new Intent(this, profile.class);
            signupfinal.putExtra("FNAME", fname);
            signupfinal.putExtra("LNAME", lname);
            signupfinal.putExtra("OCCUPATION", occupationselect);
            signupfinal.putExtra("LOCATION", locationselect);
            signupfinal.putExtra("COUNTRY", countryselect);
            signupfinal.putExtra("EMAIL", emailadd);
            signupfinal.putExtra("PHONENUMBER", phonenum);
            signupfinal.putExtra("TWITTER", twitt);
            signupfinal.putExtra("FACEBOOK", faceb);
            startActivity(signupfinal);
        } else {
            Toast.makeText(this, "Please fill the form", Toast.LENGTH_SHORT).show();
        }
    }
}
