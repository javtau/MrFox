package com.javier_lozano.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {
    private TextView txt_splash1 ;
    private TextView txt_splash2 ;
    private ImageView img;
    private LinearLayout spalahtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysplash);
        txt_splash1 = (TextView) findViewById(R.id.lbl_splahtext) ;
        txt_splash2 = (TextView) findViewById(R.id.lbl_splahtext2) ;
        spalahtext = (LinearLayout) findViewById(R.id.lbl_splah);
        img = (ImageView) findViewById(R.id.imageView) ;
        Typeface font = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        txt_splash1.setTypeface(font);
        txt_splash2.setTypeface(font);
        Animation action1 = AnimationUtils.loadAnimation(this, R.anim.moves);
        Animation action2 = AnimationUtils.loadAnimation(MySplash.this, R.anim.moves2);

        img.setAnimation(action1);
        action1.start();
        spalahtext.setAnimation(action2);
        action2.start();
        action2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation action3 = AnimationUtils.loadAnimation(MySplash.this, R.anim.pulse_animation);
                spalahtext.setAnimation(action3);
                action3.start();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MySplash
                        .this, MyLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3500);
    }
}
