package com.javier_lozano.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyLogin extends AppCompatActivity {
    private TextView txt_splash1 ;
    private TextView txt_splash2 ;
    private TextView txt_subbtitle ;
    private TextView txt_register ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);
       txt_splash1 = (TextView) findViewById(R.id.lbl_splahtext) ;
        txt_splash2 = (TextView) findViewById(R.id.lbl_splahtext2) ;
        txt_subbtitle = (TextView) findViewById(R.id.txt_slogan) ;
        txt_register = (TextView) findViewById(R.id.txt_singin) ;
        Typeface font = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        txt_splash1.setTypeface(font);
        txt_splash2.setTypeface(font);
        txt_subbtitle.setTypeface(font);
        txt_register.setTypeface(font);
    }

    public void ingresar(View v){
        Intent i = new Intent(this,MyMain.class);
        startActivity(i);

    }
}
