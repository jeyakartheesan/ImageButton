package com.jk.it2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Link extends AppCompatActivity {
        TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        tv1=findViewById(R.id.id5);
        tv2=findViewById(R.id.id6);
        SharedPreferences sp=getApplicationContext().getSharedPreferences("pref",MODE_PRIVATE);
        String msg=sp.getString("key1",null);
        String msg1=sp.getString("key2",null);
        tv1.setText(msg);
        tv2.setText(msg1);
    }

    public void vikki(View view) {
        Intent i=new Intent(getApplicationContext(),NextActivity.class);
        startActivity(i);
    }
}
