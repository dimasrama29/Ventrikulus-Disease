package com.example.lambungdisease;


import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

     private ImageView imgridi, imgdiagn;
     private CardView cddata;
     private Button btdiagnosis,btnriwayat;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_home, container, false);
        btdiagnosis = (Button) rootview.findViewById(R.id.btdiag);
        btdiagnosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),IsiBiodata.class);
                startActivity(intent);
            }
        });

        btnriwayat = rootview.findViewById(R.id.btnridi);
        btnriwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),RiwayatDiagnosa.class));
            }
        });

        imgdiagn = rootview.findViewById(R.id.imgdiag);
        imgdiagn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),IsiBiodata.class);
                startActivity(intent);
            }
        });

        imgridi = rootview.findViewById(R.id.img_ridi);
        imgridi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),RiwayatDiagnosa.class);
                startActivity(intent);
            }
        });

        cddata = rootview.findViewById(R.id.datapenyakit);
        cddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),DataPenyakit.class);
                startActivity(intent);
            }
        });

        return rootview;

    }

}
