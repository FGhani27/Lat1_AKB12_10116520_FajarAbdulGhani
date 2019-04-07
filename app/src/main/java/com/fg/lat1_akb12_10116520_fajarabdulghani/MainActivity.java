package com.fg.lat1_akb12_10116520_fajarabdulghani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        //Fajar Abdul Ghani - 10116520 - Sabtu, 6 April 2019
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = (Button) findViewById(R.id.button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Kode.class);
                startActivity(i);
            }
        });

    }


}
