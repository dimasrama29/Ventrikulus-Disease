package com.example.lambungdisease;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;

import static com.google.firebase.storage.FirebaseStorage.getInstance;

public class RiwayatDiagnosa extends AppCompatActivity {
    private Button btnDelete;

    //Variabel Firebase
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
        setContentView(R.layout.activity_riwayat_diagnosa);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Users");
        mStorageRef = getInstance().getReference(); //firebase storage reference
        btnsend = findViewById(R.id.sendBtn);

        mSend = findViewById(R.id.sendBtn);

        mPenyakit = findViewById(R.id.penyakitValue);

        Bundle extras = getIntent().getExtras();
        mHasil = extras.getString(KEY_RESULT);
        mPenyakit.setText(mHasil);

        Query query = databaseReference.orderByChild("email").equalTo(user.getEmail());
        query.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                // check until required data get
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    // get data
                    String nama = "" + ds.child("nama").getValue();
                    String tanggalLahir = "" + ds.child("tanggalLahir").getValue();
                    String gender = "" + ds.child("gender").getValue();
                    String alamat = "" + ds.child("alamat").getValue();
                    String email = "" + ds.child("email").getValue();
                    String tlp = "" + ds.child("nomorTelepon").getValue();
                    String pekerjaan = "" + ds.child("pekerjaan").getValue();

                    //set data
                    mNama.setText(nama);
                    mTtl.setText(tanggalLahir);
                    mGender.setText(gender);
                    mAlamat.setText(alamat);
                    mEmail.setText(email);
                    mTlp.setText(tlp);
                    mJob.setText(pekerjaan);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        btnDelete = (Button) findViewById(R.id.deleteBtn);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user != null){
                    user.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(RiwayatDiagnosa.this, "Akun Anda berhasil dihapus", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RiwayatDiagnosa.this, MainActivity.class));
                                finish();
                            }
                        }
                    });
                }
            }
        });


    }

    public void Ok(View view) {
        Intent intent = new Intent(this, HomeFragment.class);
        startActivity(intent);
    }

}
