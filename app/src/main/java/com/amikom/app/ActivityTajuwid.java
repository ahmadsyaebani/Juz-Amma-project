package com.amikom.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTajuwid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajuwid);



        Button button1 = (Button) findViewById(R.id.buttonIdzhar);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Idzhar.class);
                startActivity(i);
            }
        });


        Button button2 = (Button) findViewById(R.id.buttonBighunah);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Bigunah.class);
                startActivity(i);
            }
        });

        Button button3 = (Button) findViewById(R.id.buttonBillagunah);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Bilagunah.class);
                startActivity(i);
            }
        });

        Button button4 = (Button) findViewById(R.id.buttonIkhfa);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Ikhfa.class);
                startActivity(i);
            }
        });

        Button button5 = (Button) findViewById(R.id.buttonIqlab);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Iqlab.class);
                startActivity(i);
            }
        });




    }
}


