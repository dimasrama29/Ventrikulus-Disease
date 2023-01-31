package com.example.lambungdisease;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import static android.text.TextUtils.isEmpty;

public class IsiBiodata extends AppCompatActivity {

    private DatabaseReference database;

    private Button btSubmit;
    private EditText etNama;
    private EditText etTanggalLahir;
    private EditText etAlamat;
    private EditText etNoTelp;
    private EditText etEmail;
    private EditText etPekerjaan;
    private RadioButton mGenderOption;
    private RadioGroup mGender;
    String strGender;

    // variable fields EditText dan Button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_biodata);

        //inisialisasi fields EditText dan Button
        etNama =(EditText)findViewById(R.id.id_nama);
        etTanggalLahir =(EditText)findViewById(R.id.id_tanggalLahir);
        etAlamat =(EditText)findViewById(R.id.id_alamat);
        etNoTelp =(EditText)findViewById(R.id.id_nomorTelp);
        etEmail =(EditText)findViewById(R.id.id_email);
        etPekerjaan =(EditText)findViewById(R.id.id_pekerjaan);
        mGender = findViewById(R.id.rg_gender);
        btSubmit =(Button)findViewById(R.id.bt_submit);


        //mengambil referensi ke firebase database
        database = FirebaseDatabase.getInstance().getReference();

        //datepicker
        final Calendar myCalendar = Calendar.getInstance();

        final EditText edittext= (EditText) findViewById(R.id.id_tanggalLahir);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

            private void updateLabel() {
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                edittext.setText(sdf.format(myCalendar.getTime()));
            }

        };

        edittext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(IsiBiodata.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        //Radio button jenis kelamin
        mGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                mGenderOption = mGender.findViewById(checkedId);
                switch (checkedId){
                    case R.id.rb_male:
                        strGender = mGenderOption.getText().toString();
                        break;
                    case R.id.rb_female:
                        strGender = mGenderOption.getText().toString();
                        break;

                    //default:
                }
            }
        });

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isEmpty(etNama.getText().toString()) && !isEmpty(etTanggalLahir.getText().toString()) && !isEmpty(etAlamat.getText().toString())
                        && !isEmpty(etEmail.getText().toString()) && !isEmpty(etNoTelp.getText().toString()) && !isEmpty(etPekerjaan.getText().toString()))
                    submitBiodata(new Biodata(etNama.getText().toString(), etTanggalLahir.getText().toString(),
                            etAlamat.getText().toString(), etNoTelp.getText().toString(), etEmail.getText().toString(),
                            etPekerjaan.getText().toString(), strGender.toString()));
                else
                    Snackbar.make(findViewById(R.id.bt_submit), "Biodata tidak boleh kosong",
                            Snackbar.LENGTH_LONG).show();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        etNama.getWindowToken(), 0);


            }
        });


    }

    private boolean isEmpty(String s){
        return TextUtils.isEmpty(s);
    }

    private void submitBiodata(Biodata biodata) {
        database.child("biodata").push().setValue(biodata).addOnSuccessListener(this,
                new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        try{
                        etNama.setText("");
                        etTanggalLahir.setText("");
                        etAlamat.setText("");
                        etNoTelp.setText("");
                        etEmail.setText("");
                        etPekerjaan.setText("");
                        Snackbar.make(findViewById(R.id.bt_submit), "Data berhasil ditambahkan",
                                Snackbar.LENGTH_LONG).show();
                            Intent intent = new Intent(IsiBiodata.this, Diagnosis.class);
                            startActivity(intent);
                        }catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(getApplication(), "Isikah biodata dengan lengkap!", Toast.LENGTH_SHORT).show();
                    }
                }
                });
        }
    public static Intent getActIntent(Activity activity){

        return new Intent(activity, IsiBiodata.class);
    }
}
