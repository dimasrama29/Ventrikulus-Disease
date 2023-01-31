package com.example.lambungdisease;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DataPenyakit extends AppCompatActivity {

    ListView list;
    String titles[] = {"Gastritis", "Dispepsia", "Gastro Eksofagus Repluksides", "Maag", "Tukak Lambung"};
    String descriptions[] = {"Tap untuk melihat", "Tap untuk melihat", "Tap untuk melihat", "Tap untuk melihat", "Tap untuk melihat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_penyakit);

        list = findViewById(R.id.list1);

        //membuat class myAdapter
        MyAdapter adapter = new MyAdapter(this, titles, descriptions);
        //set adapater ke list
        list.setAdapter(adapter);

        //handle item clicks (membuat toast ketika di klik)
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //punya 5 items
                if (position == 0){
                    Intent myIntent  = new Intent(view.getContext(), Gastritis.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1){
                    Intent myIntent  = new Intent(view.getContext(), Dispepsia.class);
                    startActivityForResult(myIntent, 1);
                }

                if (position == 2){
                    Intent myIntent  = new Intent(view.getContext(), GERD.class);
                    startActivityForResult(myIntent, 2);
                }

                if (position == 3){
                    Intent myIntent  = new Intent(view.getContext(), Maag.class);
                    startActivityForResult(myIntent, 3);
                }

                if (position == 4){
                    Intent myIntent  = new Intent(view.getContext(), TukakLambung.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String myTitles[];
        String myDescription[];

        MyAdapter(Context c, String[] titles, String[] descriptions){
            super(c, R.layout.row, R.id.text1, titles);
            this.context = c;
            this.myTitles = titles;
            this.myDescription = descriptions;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView myTitle = row.findViewById(R.id.text1);
            TextView myDescription = row.findViewById(R.id.description1);
            myTitle.setText(titles[position]);
            myDescription.setText(descriptions[position]);
            return row;
        }
    }

    public static Intent getActIntent(Activity activity) {
        //kode untuk pengambilan Intent
        return new Intent(activity, MainActivity.class);
    }
}
