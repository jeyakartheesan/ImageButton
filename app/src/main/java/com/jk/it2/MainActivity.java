package com.jk.it2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.*;
import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t=new Thread()
        {
            public void run()
            {
                try {
                    sleep(2500);
                    Intent i=new Intent(getApplicationContext(),NextActivity.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        t.start();


    }


}
