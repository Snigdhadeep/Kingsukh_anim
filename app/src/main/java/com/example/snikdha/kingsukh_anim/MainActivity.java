package com.example.snikdha.kingsukh_anim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageButton button1=(ImageButton) findViewById(R.id.imageButton) ;

        final Animation zoomin= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);

        final Animation zoomout = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoomout);

        button1.startAnimation(zoomout);

        button1.startAnimation(zoomin);


        boolean pressed = true;
                if(!pressed)
                {

                    button1.startAnimation(zoomin);

                    pressed = !pressed;

                } else
                {

                   button1.startAnimation(zoomout);

                    pressed = !pressed;
                }
            }


    }

