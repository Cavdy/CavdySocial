package com.example.android.cavdysocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class home extends AppCompatActivity {
    TextView fname;
    TextView lname;
    TextView occupation;
    int posts = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void postpost(View view) {
        posts = posts + 1;
        EditText postedit = (EditText) findViewById(R.id.whatsmind);
        String editpost = postedit.getText().toString();

        if(editpost != null && !editpost.trim().isEmpty()) {
            if(posts == 1) {
                ImageView profileimage = (ImageView) findViewById(R.id.profile_image);
                profileimage.setImageResource(R.drawable.hack);
                fname = (TextView) findViewById(R.id.first_name);
                fname.setText(" " + getIntent().getStringExtra("FNAME"));
                lname = (TextView) findViewById(R.id.last_name);
                lname.setText(getIntent().getStringExtra("LNAME") + " ");
                occupation = (TextView) findViewById(R.id.occupation);
                occupation.setText(getIntent().getStringExtra("OCCUPATION"));
                TextView postsone = (TextView) findViewById(R.id.posts);
                postsone.setText(editpost);
            }
            if(posts == 2) {
                ImageView profileimage = (ImageView) findViewById(R.id.profile_image1);
                profileimage.setImageResource(R.drawable.hack);
                fname = (TextView) findViewById(R.id.first_name1);
                fname.setText(" " + getIntent().getStringExtra("FNAME"));
                lname = (TextView) findViewById(R.id.last_name1);
                lname.setText(getIntent().getStringExtra("LNAME") + " ");
                occupation = (TextView) findViewById(R.id.occupation1);
                occupation.setText(getIntent().getStringExtra("OCCUPATION"));
                TextView postsone = (TextView) findViewById(R.id.posts1);
                postsone.setText(editpost);
            }
            if(posts == 3) {
                ImageView profileimage = (ImageView) findViewById(R.id.profile_image2);
                profileimage.setImageResource(R.drawable.hack);
                fname = (TextView) findViewById(R.id.first_name2);
                fname.setText(" " + getIntent().getStringExtra("FNAME"));
                lname = (TextView) findViewById(R.id.last_name2);
                lname.setText(getIntent().getStringExtra("LNAME") + " ");
                occupation = (TextView) findViewById(R.id.occupation2);
                occupation.setText(getIntent().getStringExtra("OCCUPATION"));
                TextView postsone = (TextView) findViewById(R.id.posts2);
                postsone.setText(editpost);
            }
            if(posts == 4) {
                ImageView profileimage = (ImageView) findViewById(R.id.profile_image3);
                profileimage.setImageResource(R.drawable.hack);
                fname = (TextView) findViewById(R.id.first_name3);
                fname.setText(" " + getIntent().getStringExtra("FNAME"));
                lname = (TextView) findViewById(R.id.last_name3);
                lname.setText(getIntent().getStringExtra("LNAME") + " ");
                occupation = (TextView) findViewById(R.id.occupation3);
                occupation.setText(getIntent().getStringExtra("OCCUPATION"));
                TextView postsone = (TextView) findViewById(R.id.posts3);
                postsone.setText(editpost);
            }
            if(posts == 5) {
                ImageView profileimage = (ImageView) findViewById(R.id.profile_image4);
                profileimage.setImageResource(R.drawable.hack);
                fname = (TextView) findViewById(R.id.first_name4);
                fname.setText(" " + getIntent().getStringExtra("FNAME"));
                lname = (TextView) findViewById(R.id.last_name4);
                lname.setText(getIntent().getStringExtra("LNAME") + " ");
                occupation = (TextView) findViewById(R.id.occupation4);
                occupation.setText(getIntent().getStringExtra("OCCUPATION"));
                TextView postsone = (TextView) findViewById(R.id.posts4);
                postsone.setText(editpost);
            }
            if(posts == 6) {
                ImageView profileimage = (ImageView) findViewById(R.id.profile_image5);
                profileimage.setImageResource(R.drawable.hack);
                fname = (TextView) findViewById(R.id.first_name5);
                fname.setText(" " + getIntent().getStringExtra("FNAME"));
                lname = (TextView) findViewById(R.id.last_name5);
                lname.setText(getIntent().getStringExtra("LNAME") + " ");
                occupation = (TextView) findViewById(R.id.occupation5);
                occupation.setText(getIntent().getStringExtra("OCCUPATION"));
                TextView postsone = (TextView) findViewById(R.id.posts5);
                postsone.setText(editpost);
            }
            if(posts == 7) {
                ImageView profileimage = (ImageView) findViewById(R.id.profile_image6);
                profileimage.setImageResource(R.drawable.hack);
                fname = (TextView) findViewById(R.id.first_name6);
                fname.setText(" " + getIntent().getStringExtra("FNAME"));
                lname = (TextView) findViewById(R.id.last_name6);
                lname.setText(getIntent().getStringExtra("LNAME") + " ");
                occupation = (TextView) findViewById(R.id.occupation6);
                occupation.setText(getIntent().getStringExtra("OCCUPATION"));
                TextView postsone = (TextView) findViewById(R.id.posts5);
                postsone.setText(editpost);
            }
        } else {
            Toast.makeText(this, "Please put in something", Toast.LENGTH_SHORT).show();
        }
    }
}
