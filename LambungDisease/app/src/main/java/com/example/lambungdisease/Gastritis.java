package com.example.lambungdisease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gastritis extends AppCompatActivity {

    private Button bt_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastritis);
        bt_back = (Button) findViewById(R.id.bt_activity2);

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gastritis.this,DataPenyakit.class);
                startActivity(intent);
            }
        });
    }
}

