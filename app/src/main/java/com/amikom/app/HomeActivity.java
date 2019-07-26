package com.amikom.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonBacaJuzamma =(Button) findViewById(R.id.btn_juzamma);
        buttonBacaJuzamma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityBacaJuzamma.class);
                startActivity(intent);
            }
        });


        Button buttonTajuwid =(Button) findViewById(R.id.btn_tajuwid);
        buttonTajuwid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityTajuwid.class);
                startActivity(intent);
            }
        });


        Button buttonTips =(Button) findViewById(R.id.btn_tips);
        buttonTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityKuis.class);
                startActivity(intent);
            }
        });
    }
}
