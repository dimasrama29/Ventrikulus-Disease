package com.example.lambungdisease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pengaturan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);
    }
    public void bantuan(View view) {
        Intent bant = new Intent(this, bantuan.class);
        startActivity(bant);
    }

    public void tentang(View view) {
        Intent tent = new Intent(this, tentang.class);
        startActivity(tent);
    }
}
