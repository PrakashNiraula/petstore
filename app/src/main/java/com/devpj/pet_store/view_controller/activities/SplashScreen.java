package com.devpj.pet_store.view_controller.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import com.devpj.pet_store.R;

public class SplashScreen extends AppCompatActivity {
    ImageView paw1,paw2,paw3,paw4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        paw1=findViewById(R.id.paw1);
        paw2=findViewById(R.id.paw2);
        paw3=findViewById(R.id.paw3);
        paw4=findViewById(R.id.paw4);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

               paw1.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {

                        paw2.setVisibility(View.VISIBLE);


                        new Handler().postDelayed(new Runnable(){
                            @Override
                            public void run() {

                                paw3.setVisibility(View.VISIBLE);

                                new Handler().postDelayed(new Runnable(){
                                    @Override
                                    public void run() {

                                        paw4.setVisibility(View.VISIBLE);

                                        new Handler().postDelayed(new Runnable(){
                                            @Override
                                            public void run() {

                                             startActivity(new Intent(SplashScreen.this,Login.class));
                                             finish();




                                            }
                                        }, 500);


                                    }
                                }, 800);


                            }
                        }, 800);

                    }
                }, 800);



            }
        }, 1500);


    }
}