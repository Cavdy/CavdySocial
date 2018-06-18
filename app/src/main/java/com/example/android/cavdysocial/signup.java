package com.example.android.cavdysocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText fname;
    EditText lname;
    EditText location;
    EditText occupation;
    EditText country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void next(View view) {
        /**
         * Getting the data pass through the EditText View
         */
        fname = (EditText) findViewById(R.id.f_name);
        String fnameaccept = fname.getText().toString();
        lname = (EditText) findViewById(R.id.l_name);
        String lnameaccept = lname.getText().toString();
        occupation = (EditText) findViewById(R.id.occupation);
        String occupationaccept = occupation.getText().toString();
        location = (EditText) findViewById(R.id.location);
        String locationaccept = location.getText().toString();
        country = (EditText) findViewById(R.id.country);
        String countryaccept = country.getText().toString();

        if(fnameaccept != null && !fnameaccept.trim().isEmpty() && lnameaccept != null && !lnameaccept.trim().isEmpty() && locationaccept != null && !locationaccept.trim().isEmpty() && countryaccept != null && !countryaccept.trim().isEmpty() && occupationaccept != null && !occupationaccept.trim().isEmpty()) {
            Intent userdetails = new Intent(this, signup2.class);
            userdetails.putExtra("FNAME", fnameaccept);
            userdetails.putExtra("LNAME", lnameaccept);
            userdetails.putExtra("OCCUPATION", occupationaccept);
            userdetails.putExtra("LOCATION", locationaccept);
            userdetails.putExtra("COUNTRY", countryaccept);
            startActivity(userdetails);
        }else {
            Toast.makeText(this, "Fill the form please", Toast.LENGTH_SHORT).show();
        }
    }
}
