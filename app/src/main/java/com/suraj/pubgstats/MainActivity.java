package com.suraj.pubgstats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView ecard1,ecard2,ecard3,ecard4;




        ecard1 = findViewById(R.id.erangelid);
        ecard2 = findViewById(R.id.miramarid);
        ecard3 = findViewById(R.id.sanhokid);
        ecard4 = findViewById(R.id.vikendiid);




        ecard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, erangel.class);
                startActivity(i);
            }
        });
        ecard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, miramar.class);
                startActivity(i);
            }
        });
        ecard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, sanhok.class);
                startActivity(i);
            }
        });
        ecard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, vikendi.class);
                startActivity(i);
            }
        });









    }
}
