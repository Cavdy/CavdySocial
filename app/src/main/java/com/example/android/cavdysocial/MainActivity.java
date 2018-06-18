package com.example.android.cavdysocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView startImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startImage = (ImageView) findViewById(R.id.start_up_image);
        Animation startAnimation = AnimationUtils.loadAnimation(this,R.anim.startup);
        startImage.startAnimation(startAnimation);
        final Intent i = new Intent(this, signup.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
