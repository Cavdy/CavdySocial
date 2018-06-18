package com.example.android.cavdysocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    TextView fname;
    TextView lname;
    TextView occupation;
    TextView locationselect;
    TextView countryselect;
    TextView email;
    TextView phonenumber;
    TextView twitter;
    TextView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        fname = (TextView) findViewById(R.id.username_receiver2);
        fname.setText(" " + getIntent().getStringExtra("FNAME"));
        lname = (TextView) findViewById(R.id.username_receiver);
        lname.setText(getIntent().getStringExtra("LNAME") + " ");
        occupation = (TextView) findViewById(R.id.username_receivr);
        occupation.setText(getIntent().getStringExtra("OCCUPATION"));
        locationselect = (TextView) findViewById(R.id.username_recever);
        locationselect.setText(getIntent().getStringExtra("LOCATION") + ",");
        countryselect = (TextView) findViewById(R.id.username_reever);
        countryselect.setText(" " + getIntent().getStringExtra("COUNTRY"));
        email = (TextView) findViewById(R.id.emailaddress);
        email.setText(getIntent().getStringExtra("EMAIL"));
        phonenumber = (TextView) findViewById(R.id.phonenumber);
        phonenumber.setText(getIntent().getStringExtra("PHONENUMBER"));
        twitter = (TextView) findViewById(R.id.twitter);
        twitter.setText("@" + getIntent().getStringExtra("TWITTER"));
        facebook = (TextView) findViewById(R.id.facebook);
        facebook.setText(getIntent().getStringExtra("FACEBOOK"));
    }

    public void gohome(View view) {
        String firstname = getIntent().getStringExtra("FNAME");
        String lastname = getIntent().getStringExtra("LNAME");
        String occupationname = getIntent().getStringExtra("OCCUPATION");

        Intent gohomie = new Intent(this, home.class);
        gohomie.putExtra("FNAME", firstname);
        gohomie.putExtra("LNAME", lastname);
        gohomie.putExtra("OCCUPATION", occupationname);
        startActivity(gohomie);
    }
}
