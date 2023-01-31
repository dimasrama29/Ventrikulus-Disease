package com.example.lambungdisease;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.zip.Inflater;

import static com.google.firebase.storage.FirebaseStorage.getInstance;

public class LaporanDiagnosis extends AppCompatActivity {
    //firebase
    FirebaseAuth firebaseAuth;
    FirebaseUser user;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private Button btnsend;

    //storage
    private StorageReference mStorageRef;

    private TextView mNama, mTtl, mGender, mAlamat, mEmail, mTlp, mJob;
    private String nama, tanggallahir, jenisKelamin, Alamat, Email, Telep, Pekerjaan;
    private Button mSend;

    private String mHasil;
    private String KEY_RESULT = "HASIL";
    TextView mPenyakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan_diagnosis);

        //init firebase
        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Users");
        mStorageRef = getInstance().getReference(); //firebase storage reference
        btnsend = findViewById(R.id.sendBtn);

        //init views
//        mNama = findViewById(R.id.nameValue);
//        mTtl = findViewById(R.id.birthValue);
//        mGender = findViewById(R.id.genderValue);
//        mAlamat = findViewById(R.id.addressValue);
//        mEmail = findViewById(R.id.emailValue);
//        mTlp = findViewById(R.id.phoneValue);
//        mJob = findViewById(R.id.jobValue);

        mSend = findViewById(R.id.sendBtn);

        mPenyakit = findViewById(R.id.penyakitValue);

        Bundle extras = getIntent().getExtras();
        mHasil = extras.getString(KEY_RESULT);
        mPenyakit.setText(mHasil);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                send();
            }
        });
//        nama = mNama.getText().toString().trim();
//        tanggallahir = mTtl.getText().toString().trim();
//        jenisKelamin = mGender.getText().toString().trim();
//        Alamat = mAlamat.getText().toString().trim();
//        Email = mEmail.getText().toString().trim();
//        Telep = mTlp.getText().toString().trim();
//        Pekerjaan = mJob.getText().toString().trim();
//
//        Query query = databaseReference.orderByChild("nama").equalTo(user.getEmail());
//        query.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                // check until required data get
//                for (DataSnapshot ds : dataSnapshot.getChildren()) {
//                    // get data
//                    String nama = "" + ds.child("nama").getValue();
//                    String tanggalLahir = "" + ds.child("tanggalLahir").getValue();
//                    String gender = "" + ds.child("gender").getValue();
//                    String alamat = "" + ds.child("alamat").getValue();
//                    String email = "" + ds.child("email").getValue();
//                    String tlp = "" + ds.child("nomorTelepon").getValue();
//                    String pekerjaan = "" + ds.child("pekerjaan").getValue();
//
//                    //set data
//                    mNama.setText(nama);
//                    mTtl.setText(tanggalLahir);
//                    mGender.setText(gender);
//                    mAlamat.setText(alamat);
//                    mEmail.setText(email);
//                    mTlp.setText(tlp);
//                    mJob.setText(pekerjaan);
//                }
//
//            }
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//        mSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//}
    }

    public void send() {
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
    }
}

