package com.fg.lat1_akb12_10116520_fajarabdulghani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beres);

        Button a = (Button) findViewById(R.id.button5);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(beres.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
