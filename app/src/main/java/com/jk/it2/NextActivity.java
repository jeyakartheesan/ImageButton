package com.jk.it2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class NextActivity extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4,btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        btn1=findViewById(R.id.id1);
        btn2=findViewById(R.id.id2);
        btn3=findViewById(R.id.id3);
        btn4=findViewById(R.id.id4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Button1";
                String msg2="Android 1";

                SharedPreferences sp=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("key1",msg);
                editor.putString("key2",msg2);
                editor.apply();
                Intent i=new Intent(getApplicationContext(),Link.class);
                startActivity(i);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Button2";
               String msg2="Android 2";
                SharedPreferences sp=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("key1",msg);
                editor.putString("key2",msg2);
                editor.apply();
                Intent i=new Intent(getApplicationContext(),Link.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Button3";
                String msg2="Android 3";
                SharedPreferences sp=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("key1",msg);
                editor.putString("key2",msg2);
                editor.apply();
                Intent i=new Intent(getApplicationContext(),Link.class);
                startActivity(i);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="Button4";
                String msg2="Android 4";
                SharedPreferences sp=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("key1",msg);
                editor.putString("key2",msg2);
                editor.apply();
                Intent i=new Intent(getApplicationContext(),Link.class);
                startActivity(i);

            }
        });

    }
}
