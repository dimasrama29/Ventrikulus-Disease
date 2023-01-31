package com.example.lambungdisease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TukakLambung extends AppCompatActivity {
    private Button bt_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tukak_lambung);

        bt_back = (Button) findViewById(R.id.bt_activity6);

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TukakLambung.this,DataPenyakit.class);
                startActivity(intent);
            }
        });
    }
}
