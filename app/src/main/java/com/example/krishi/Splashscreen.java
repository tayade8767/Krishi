package com.example.krishi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);




        Thread T=new Thread(){
            public void run()
            {                                               //   it is splash screen and and stop for the 4 second
                try
                {
                    sleep(4000);
                }
                catch(Exception e)                                //    and if exception is accorce the then it can be handle
                {
                    e.printStackTrace();
                }
                finally {
                    Intent ihome=new Intent(Splashscreen.this, MainActivity.class);  //it can go main screen from spalsh screen to another screen
                    startActivity(ihome);
                    finish();
                }
            }
        };
        T.start();







    }
}