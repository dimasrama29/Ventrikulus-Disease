package com.example.lambungdisease;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class infolambung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infolambung);

        HomeFragment fragment = new HomeFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.linear1,fragment).commit();

    }
    public void art1(View view) {
        Intent art1 = new Intent(Intent.ACTION_VIEW);
        art1.setData(Uri.parse("https://www.depokpos.com/2017/08/10-cara-mencegah-penyakit-maag-kambuh/"));
        startActivity(art1);
    }

    public void art2(View view) {
        Intent art2 = new Intent(Intent.ACTION_VIEW);
        art2.setData(Uri.parse("https://www.lemonilo.com/blog/bermanfaat-inilah-5-cara-mudah-menjaga-kesehatan-lambung-walaupun-berpuasa"));
        startActivity(art2);
    }

    public void art3(View view) {
        Intent art3 = new Intent(Intent.ACTION_VIEW);
        art3.setData(Uri.parse("https://lifestyle.kompas.com/read/2019/02/04/181800420/yang-boleh-dan-tidak-boleh-dimakan-ketika-sakit-lambung?page=all"));
        startActivity(art3);
    }

    public void art4(View view) {
        Intent art4 = new Intent(Intent.ACTION_VIEW);
        art4.setData(Uri.parse("https://hellosehat.com/pusat-kesehatan/gangguan-pencernaan/gastritis/makanan-pemicu-asam-lambung/"));
        startActivity(art4);
    }

    public void art5(View view) {
        Intent art5 = new Intent(Intent.ACTION_VIEW);
        art5.setData(Uri.parse("https://www.alodokter.com/3-penyakit-yang-mengganggu-fungsi-lambung"));
        startActivity(art5);
    }
}
