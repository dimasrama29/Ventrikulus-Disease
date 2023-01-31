package com.example.lambungdisease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dispepsia extends AppCompatActivity {

    private Button bt_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispepsia);
        bt_back = (Button) findViewById(R.id.bt_activity3);

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dispepsia.this,DataPenyakit.class);
                startActivity(intent);
            }
        });
    }
}