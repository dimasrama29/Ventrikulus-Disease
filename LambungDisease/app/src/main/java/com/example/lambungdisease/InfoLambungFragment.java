package com.example.lambungdisease;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoLambungFragment extends Fragment {

    private CardView art1;
    private CardView art2;
    private CardView art3;
    private CardView art4;
    private CardView art5;

    public InfoLambungFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.activity_infolambung, container, false);
       // WebView webView1 = (WebView)v.findViewById(R.id.judul_art1);
        art1 =  v.findViewById(R.id.judul_art1);
        art2 =  v.findViewById(R.id.judul_art2);
        art3 =  v.findViewById(R.id.judul_art3);
        art4 =  v.findViewById(R.id.judul_art4);
        art5 =  v.findViewById(R.id.judul_art5);

        art1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String web =  "https://www.depokpos.com/2017/08/10-cara-mencegah-penyakit-maag-kambuh/";
                Uri artikel1 = Uri.parse(web);
                Intent arti1 = new Intent(Intent.ACTION_VIEW, artikel1);
                startActivity(arti1);
            }
        });

        art2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String web2 =  "https://www.lemonilo.com/blog/bermanfaat-inilah-5-cara-mudah-menjaga-kesehatan-lambung-walaupun-berpuasa";
                Uri artikel2 = Uri.parse(web2);
                Intent arti2 = new Intent(Intent.ACTION_VIEW, artikel2);
                startActivity(arti2);
            }
        });

        art3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String web3 =  "https://lifestyle.kompas.com/read/2019/02/04/181800420/yang-boleh-dan-tidak-boleh-dimakan-ketika-sakit-lambung?page=all";
                Uri artikel3 = Uri.parse(web3);
                Intent arti3 = new Intent(Intent.ACTION_VIEW, artikel3);
                startActivity(arti3);
            }
        });

        art4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String web4 =  "https://hellosehat.com/pusat-kesehatan/gangguan-pencernaan/gastritis/makanan-pemicu-asam-lambung/";
                Uri artikel4 = Uri.parse(web4);
                Intent arti4 = new Intent(Intent.ACTION_VIEW, artikel4);
                startActivity(arti4);
            }
        });

        art5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String web5 =  "https://www.alodokter.com/3-penyakit-yang-mengganggu-fungsi-lambung";
                Uri artikel5 = Uri.parse(web5);
                Intent arti5 = new Intent(Intent.ACTION_VIEW, artikel5);
                startActivity(arti5);
            }
        });

        return v;
    }

}
