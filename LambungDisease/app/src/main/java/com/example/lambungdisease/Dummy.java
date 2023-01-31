package com.example.lambungdisease;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Dummy extends AppCompatActivity implements View.OnClickListener {

    private Button next1,next2,next3,next4,next5,next6,next7;
    private  Button back1,back2,back3,back4,back5,back6,back7;
    private LinearLayout pg1, pg2, pg3, pg4, pg5, pg6, pg7, pg8;

    //SPKK
    private RadioGroup mRg1, mRg2, mRg3, mRg4, mRg5, mRg6, mRg7, mRg8, mRg9, mRg10, mRg11, mRg12,
            mRg13, mRg14, mRg15, mRg16, mRg17, mRg18, mRg19, mRg20, mRg21, mRg22, mRg23, mRg24,
            mRg25, mRg26, mRg27, mRg28, mRg29, mRg30, mRg31, mRg32, mRg33, mRg34, mRg35, mRg36,
            mRg37;
    private RadioButton mRb1_1, mRb1_2, mRb2_1, mRb2_2, mRb3_1, mRb3_2, mRb4_1, mRb4_2, mRb5_1,
            mRb5_2, mRb6_1, mRb6_2, mRb7_1, mRb7_2, mRb8_1, mRb8_2, mRb9_1, mRb9_2,
            mRb10_1, mRb10_2, mRb11_1, mRb11_2, mRb12_1, mRb12_2, mRb13_1, mRb13_2,
            mRb14_1, mRb14_2, mRb15_1, mRb15_2, mRb16_1, mRb16_2, mRb17_1, mRb17_2, mRb18_1, mRb18_2,
            mRb19_1, mRb19_2, mRb20_1, mRb20_2, mRb21_1, mRb21_2, mRb22_1, mRb22_2,
            mRb23_1, mRb23_2, mRb24_1, mRb24_2, mRb25_1, mRb25_2, mRb26_1, mRb26_2, mRb27_1, mRb27_2,
            mRb28_1, mRb28_2, mRb29_1, mRb29_2, mRb30_1, mRb30_2, mRb31_1, mRb31_2, mRb32_1, mRb32_2,
            mRb33_1, mRb33_2, mRb34_1, mRb34_2, mRb35_1, mRb35_2, mRb36_1, mRb36_2, mRb37_1, mRb37_2;

    Button mSend;
    TextView mHasil;
    String h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20,
            h21, h22, h23, h24, h25, h26, h27, h28, h29, h30, h31, h32, h33, h34, h35, h36, h37;

    double bayes1, bayes2, bayes3, bayes4, bayes5;
    double Gbayes1, Gbayes2, Gbayes3, Gbayes4, Gbayes5, Gbayes6, Gbayes7, Gbayes8, Gbayes9, Gbayes10,
            Gbayes11, Gbayes12, Gbayes13, Gbayes14, Gbayes15, Gbayes16, Gbayes17, Gbayes18, Gbayes19,
            Gbayes20, Gbayes21, Gbayes22, Gbayes23, Gbayes24, Gbayes25, Gbayes26, Gbayes27, Gbayes28,
            Gbayes29, Gbayes30, Gbayes31, Gbayes32, Gbayes33, Gbayes34, Gbayes35, Gbayes36, Gbayes37;
    double Ebayes1, Ebayes2, Ebayes3, Ebayes4, Ebayes5;
    double Pbayes1, Pbayes2, Pbayes3, Pbayes4, Pbayes5, Pbayes6, Pbayes7, Pbayes8, Pbayes9, Pbayes10,
            Pbayes11, Pbayes12, Pbayes13, Pbayes14, Pbayes15, Pbayes16, Pbayes17, Pbayes18, Pbayes19,
            Pbayes20, Pbayes21, Pbayes22, Pbayes23, Pbayes24, Pbayes25, Pbayes26, Pbayes27, Pbayes28,
            Pbayes29, Pbayes30, Pbayes31, Pbayes32, Pbayes33, Pbayes34, Pbayes35, Pbayes36, Pbayes37;
    double Nbayes1, Nbayes2, Nbayes3, Nbayes4, Nbayes5;
    String hasil;


    private String KEY_RESULT = "HASIL";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummy);

        //Inisialisasi
        //Radio Group
        mRg1 = findViewById(R.id.rg1);
        mRg2 = findViewById(R.id.rg2);
        mRg3 = findViewById(R.id.rg3);
        mRg4 = findViewById(R.id.rg4);
        mRg5 = findViewById(R.id.rg5);
        mRg6 = findViewById(R.id.rg6);
        mRg7 = findViewById(R.id.rg7);
        mRg8 = findViewById(R.id.rg8);
        mRg9 = findViewById(R.id.rg9);
        mRg10 = findViewById(R.id.rg10);
        mRg11 = findViewById(R.id.rg11);
        mRg12 = findViewById(R.id.rg12);
        mRg13 = findViewById(R.id.rg13);
        mRg14 = findViewById(R.id.rg14);
        mRg15 = findViewById(R.id.rg15);
        mRg16 = findViewById(R.id.rg16);
        mRg17 = findViewById(R.id.rg17);
        mRg18 = findViewById(R.id.rg18);
        mRg19 = findViewById(R.id.rg19);
        mRg20 = findViewById(R.id.rg20);
        mRg21 = findViewById(R.id.rg21);
        mRg22 = findViewById(R.id.rg22);
        mRg23 = findViewById(R.id.rg23);
        mRg24 = findViewById(R.id.rg24);
        mRg25 = findViewById(R.id.rg25);
        mRg26 = findViewById(R.id.rg26);
        mRg27 = findViewById(R.id.rg27);
        mRg28 = findViewById(R.id.rg28);
        mRg29 = findViewById(R.id.rg29);
        mRg30 = findViewById(R.id.rg30);
        mRg31 = findViewById(R.id.rg31);
        mRg32 = findViewById(R.id.rg32);
        mRg33 = findViewById(R.id.rg33);
        mRg34 = findViewById(R.id.rg34);
        mRg35 = findViewById(R.id.rg35);
        mRg36 = findViewById(R.id.rg36);
        mRg37 = findViewById(R.id.rg37);

        //Radio Button

        mRb1_1 = findViewById(R.id.rb1_1);
        mRb1_2 = findViewById(R.id.rb1_2);
        mRb2_1= findViewById(R.id.rb2_1);
        mRb2_2 = findViewById(R.id.rb2_2);
        mRb3_1 = findViewById(R.id.rb3_1);
        mRb3_2 = findViewById(R.id.rb3_2);
        mRb4_1 = findViewById(R.id.rb4_1);
        mRb4_2 = findViewById(R.id.rb4_2);
        mRb5_1 = findViewById(R.id.rb5_1);
        mRb5_2 = findViewById(R.id.rb5_2);
        mRb6_1 = findViewById(R.id.rb6_1);
        mRb6_2 = findViewById(R.id.rb6_2);
        mRb7_1 = findViewById(R.id.rb7_1);
        mRb7_2 = findViewById(R.id.rb7_2);
        mRb8_1 = findViewById(R.id.rb8_1);
        mRb8_2 = findViewById(R.id.rb8_2);
        mRb9_1 = findViewById(R.id.rb9_1);
        mRb9_2 = findViewById(R.id.rb9_2);
        mRb10_1 = findViewById(R.id.rb10_1);
        mRb10_2 = findViewById(R.id.rb10_2);
        mRb11_1 = findViewById(R.id.rb11_1);
        mRb11_2 = findViewById(R.id.rb11_2);
        mRb12_1 = findViewById(R.id.rb12_1);
        mRb12_2 = findViewById(R.id.rb12_2);
        mRb13_1 = findViewById(R.id.rb13_1);
        mRb13_2 = findViewById(R.id.rb13_2);
        mRb14_1 = findViewById(R.id.rb14_1);
        mRb14_2 = findViewById(R.id.rb14_2);
        mRb15_1 = findViewById(R.id.rb15_1);
        mRb15_2 = findViewById(R.id.rb15_2);
        mRb16_1 = findViewById(R.id.rb16_1);
        mRb16_2 = findViewById(R.id.rb16_2);
        mRb17_1 = findViewById(R.id.rb17_1);
        mRb17_2 = findViewById(R.id.rb17_2);
        mRb18_1 = findViewById(R.id.rb18_1);
        mRb18_2 = findViewById(R.id.rb18_2);
        mRb19_1 = findViewById(R.id.rb19_1);
        mRb19_2 = findViewById(R.id.rb19_2);
        mRb20_1 = findViewById(R.id.rb20_1);
        mRb20_2 = findViewById(R.id.rb20_2);
        mRb21_1 = findViewById(R.id.rb21_1);
        mRb21_2 = findViewById(R.id.rb21_2);
        mRb22_1 = findViewById(R.id.rb22_1);
        mRb22_2 = findViewById(R.id.rb22_2);
        mRb23_1 = findViewById(R.id.rb23_1);
        mRb23_2 = findViewById(R.id.rb23_2);
        mRb24_1 = findViewById(R.id.rb24_1);
        mRb24_2 = findViewById(R.id.rb24_2);
        mRb25_1 = findViewById(R.id.rb25_1);
        mRb25_2 = findViewById(R.id.rb25_2);
        mRb26_1 = findViewById(R.id.rb26_1);
        mRb26_2 = findViewById(R.id.rb26_2);
        mRb27_1 = findViewById(R.id.rb27_1);
        mRb27_2 = findViewById(R.id.rb27_2);
        mRb28_1 = findViewById(R.id.rb28_1);
        mRb28_2 = findViewById(R.id.rb28_2);
        mRb29_1 = findViewById(R.id.rb29_1);
        mRb29_2 = findViewById(R.id.rb29_2);
        mRb30_1 = findViewById(R.id.rb30_1);
        mRb30_2 = findViewById(R.id.rb30_2);
        mRb31_1 = findViewById(R.id.rb31_1);
        mRb31_2 = findViewById(R.id.rb31_2);
        mRb32_1 = findViewById(R.id.rb32_1);
        mRb32_2 = findViewById(R.id.rb32_2);
        mRb33_1 = findViewById(R.id.rb33_1);
        mRb33_2 = findViewById(R.id.rb33_2);
        mRb34_1 = findViewById(R.id.rb34_1);
        mRb34_2 = findViewById(R.id.rb34_2);
        mRb35_1 = findViewById(R.id.rb35_1);
        mRb35_2 = findViewById(R.id.rb35_2);
        mRb36_1 = findViewById(R.id.rb36_1);
        mRb36_2 = findViewById(R.id.rb36_2);
        mRb37_1 = findViewById(R.id.rb37_1);
        mRb37_2 = findViewById(R.id.rb37_2);

        mSend = findViewById(R.id.send);
        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    //no1
                    int geth1 = mRg1.getCheckedRadioButtonId();
                    if (mRg1.getCheckedRadioButtonId() == findViewById(R.id.rb1_1).getId()) {
                        mRb1_1= findViewById(geth1);
                        h1 = mRb1_1.getText().toString();
                        h1 = "0.9";
                    } else {
                        mRb1_1= findViewById(geth1);
                        h1 = mRb1_1.getText().toString();
                        h1 = "0.1";
                    }
                    //no2
                    int geth2 = mRg2.getCheckedRadioButtonId();
                    if (mRg2.getCheckedRadioButtonId() == findViewById(R.id.rb2_1).getId()) {
                        mRb2_1 = findViewById(geth2);
                        h2 = mRb2_1.getText().toString();
                        h2 = "0.8";
                    } else {
                        mRb2_1 = findViewById(geth2);
                        h2 = mRb2_1.getText().toString();
                        h2 = "0.1";
                    }
                    //no3
                    int geth3 = mRg3.getCheckedRadioButtonId();
                    if (mRg3.getCheckedRadioButtonId() == findViewById(R.id.rb3_1).getId()) {
                        mRb3_1 = findViewById(geth3);
                        h3 = mRb3_1.getText().toString();
                        h3 = "0.4";
                    } else {
                        mRb3_1 = findViewById(geth3);
                        h3 = mRb3_1.getText().toString();
                        h3 = "0.1";
                    }
                    //no4
                    int geth4 = mRg4.getCheckedRadioButtonId();
                    if (mRg4.getCheckedRadioButtonId() == findViewById(R.id.rb4_1).getId()) {
                        mRb4_1 = findViewById(geth4);
                        h4 = mRb4_1.getText().toString();
                        h4 = "0.3";
                    } else {
                        mRb4_1 = findViewById(geth4);
                        h4 = mRb4_1.getText().toString();
                        h4 = "0.1";
                    }
                    //no5
                    int geth5 = mRg5.getCheckedRadioButtonId();
                    if (mRg5.getCheckedRadioButtonId() == findViewById(R.id.rb5_1).getId()) {
                        mRb5_1 = findViewById(geth5);
                        h5 = mRb5_1.getText().toString();
                        h5 = "0.3";
                    } else {
                        mRb5_1 = findViewById(geth5);
                        h5 = mRb5_1.getText().toString();
                        h5 = "0.1";
                    }
                    //no6
                    int geth6 = mRg6.getCheckedRadioButtonId();
                    if (mRg6.getCheckedRadioButtonId() == findViewById(R.id.rb6_1).getId()) {
                        mRb6_1 = findViewById(geth6);
                        h6 = mRb6_1.getText().toString();
                        h6 = "0.2";
                    } else {
                        mRb6_1 = findViewById(geth6);
                        h6 = mRb6_1.getText().toString();
                        h6 = "0.1";
                    }
                    //no7
                    int geth7 = mRg7.getCheckedRadioButtonId();
                    if (mRg7.getCheckedRadioButtonId() == findViewById(R.id.rb7_1).getId()) {
                        mRb7_1 = findViewById(geth7);
                        h7 = mRb7_1.getText().toString();
                        h7 = "0.95";
                    } else {
                        mRb7_1 = findViewById(geth7);
                        h7 = mRb7_1.getText().toString();
                        h7 = "0.1";
                    }
                    //no8
                    int geth8 = mRg8.getCheckedRadioButtonId();
                    if (mRg8.getCheckedRadioButtonId() == findViewById(R.id.rb8_1).getId()) {
                        mRb8_1 = findViewById(geth8);
                        h8 = mRb8_1.getText().toString();
                        h8 = "0.95";
                    } else {
                        mRb8_1 = findViewById(geth8);
                        h8 = mRb8_1.getText().toString();
                        h8 = "0.1";
                    }
                    //no9
                    int geth9 = mRg9.getCheckedRadioButtonId();
                    if (mRg9.getCheckedRadioButtonId() == findViewById(R.id.rb9_1).getId()) {
                        mRb9_1 = findViewById(geth9);
                        h9 = mRb9_1.getText().toString();
                        h9 = "0.3";
                    } else {
                        mRb9_1 = findViewById(geth9);
                        h9 = mRb9_1.getText().toString();
                        h9 = "0.1";
                    }
                    //no10
                    int geth10 = mRg10.getCheckedRadioButtonId();
                    if (mRg10.getCheckedRadioButtonId() == findViewById(R.id.rb10_1).getId()) {
                        mRb10_1 = findViewById(geth10);
                        h10 = mRb10_1.getText().toString();
                        h10 = "0.4";
                    } else {
                        mRb10_1 = findViewById(geth10);
                        h10 = mRb10_1.getText().toString();
                        h10 = "0.1";
                    }
                    //no11
                    int geth11 = mRg11.getCheckedRadioButtonId();
                    if (mRg11.getCheckedRadioButtonId() == findViewById(R.id.rb11_1).getId()) {
                        mRb11_1 = findViewById(geth11);
                        h11 = mRb11_1.getText().toString();
                        h11 = "0.5";
                    } else {
                        mRb11_1 = findViewById(geth11);
                        h11 = mRb11_1.getText().toString();
                        h11 = "0.1";
                    }
                    //no12
                    int geth12 = mRg12.getCheckedRadioButtonId();
                    if (mRg12.getCheckedRadioButtonId() == findViewById(R.id.rb12_1).getId()) {
                        mRb12_1 = findViewById(geth12);
                        h12 = mRb12_1.getText().toString();
                        h12 = "0.8";
                    } else {
                        mRb12_1 = findViewById(geth12);
                        h12 = mRb12_1.getText().toString();
                        h12 = "0.1";
                    }
                    //no13
                    int geth13 = mRg13.getCheckedRadioButtonId();
                    if (mRg13.getCheckedRadioButtonId() == findViewById(R.id.rb13_1).getId()) {
                        mRb13_1 = findViewById(geth13);
                        h13 = mRb13_1.getText().toString();
                        h13 = "0.7";
                    } else {
                        mRb13_1 = findViewById(geth13);
                        h13 = mRb13_1.getText().toString();
                        h13 = "0.1";
                    }
                    //no14
                    int geth14 = mRg14.getCheckedRadioButtonId();
                    if (mRg14.getCheckedRadioButtonId() == findViewById(R.id.rb14_1).getId()) {
                        mRb14_1 = findViewById(geth14);
                        h14 = mRb14_1.getText().toString();
                        h14 = "0.8";
                    } else {
                        mRb14_1 = findViewById(geth14);
                        h14 = mRb14_1.getText().toString();
                        h14 = "0.1";
                    }
                    //no15
                    int geth15 = mRg15.getCheckedRadioButtonId();
                    if (mRg15.getCheckedRadioButtonId() == findViewById(R.id.rb15_1).getId()) {
                        mRb15_1 = findViewById(geth15);
                        h15 = mRb15_1.getText().toString();
                        h15 = "0.9";
                    } else {
                        mRb15_1 = findViewById(geth15);
                        h15 = mRb15_1.getText().toString();
                        h15 = "0.1";
                    }
                    //no16
                    int geth16 = mRg16.getCheckedRadioButtonId();
                    if (mRg16.getCheckedRadioButtonId() == findViewById(R.id.rb16_1).getId()) {
                        mRb16_1 = findViewById(geth16);
                        h16 = mRb16_1.getText().toString();
                        h16 = "0.8";
                    } else {
                        mRb16_1 = findViewById(geth16);
                        h16 = mRb16_1.getText().toString();
                        h16 = "0.1";
                    }
                    //no17
                    int geth17 = mRg17.getCheckedRadioButtonId();
                    if (mRg17.getCheckedRadioButtonId() == findViewById(R.id.rb17_1).getId()) {
                        mRb17_1 = findViewById(geth17);
                        h17 = mRb17_1.getText().toString();
                        h17 = "0.95";
                    } else {
                        mRb17_1 = findViewById(geth17);
                        h17 = mRb17_1.getText().toString();
                        h17 = "0.1";
                    }
                    //no18
                    int geth18 = mRg18.getCheckedRadioButtonId();
                    if (mRg18.getCheckedRadioButtonId() == findViewById(R.id.rb18_1).getId()) {
                        mRb18_1 = findViewById(geth18);
                        h18 = mRb18_1.getText().toString();
                        h18 = "0.95";
                    } else {
                        mRb18_1 = findViewById(geth18);
                        h18 = mRb18_1.getText().toString();
                        h18 = "0.1";
                    }
                    //no19
                    int geth19 = mRg19.getCheckedRadioButtonId();
                    if (mRg19.getCheckedRadioButtonId() == findViewById(R.id.rb19_1).getId()) {
                        mRb19_1 = findViewById(geth19);
                        h19 = mRb19_1.getText().toString();
                        h19 = "0.95";
                    } else {
                        mRb19_1 = findViewById(geth19);
                        h19 = mRb19_1.getText().toString();
                        h19 = "0.1";
                    }
                    //no20
                    int geth20 = mRg20.getCheckedRadioButtonId();
                    if (mRg20.getCheckedRadioButtonId() == findViewById(R.id.rb20_1).getId()) {
                        mRb20_1 = findViewById(geth20);
                        h20 = mRb20_1.getText().toString();
                        h20 = "0.9";
                    } else {
                        mRb20_1 = findViewById(geth20);
                        h20 = mRb20_1.getText().toString();
                        h20 = "0.1";
                    }
                    //no21
                    int geth21 = mRg21.getCheckedRadioButtonId();
                    if (mRg21.getCheckedRadioButtonId() == findViewById(R.id.rb21_1).getId()) {
                        mRb21_1 = findViewById(geth21);
                        h21 = mRb21_1.getText().toString();
                        h21 = "0.6";
                    } else {
                        mRb21_1 = findViewById(geth21);
                        h21 = mRb21_1.getText().toString();
                        h21 = "0.1";
                    }
                    //no22
                    int geth22 = mRg22.getCheckedRadioButtonId();
                    if (mRg22.getCheckedRadioButtonId() == findViewById(R.id.rb22_1).getId()) {
                        mRb22_1 = findViewById(geth22);
                        h22 = mRb22_1.getText().toString();
                        h22 = "0.7";
                    } else {
                        mRb22_1 = findViewById(geth22);
                        h22 = mRb22_1.getText().toString();
                        h22 = "0.1";
                    }
                    //no23
                    int geth23 = mRg23.getCheckedRadioButtonId();
                    if (mRg23.getCheckedRadioButtonId() == findViewById(R.id.rb23_1).getId()) {
                        mRb23_1 = findViewById(geth23);
                        h23 = mRb23_1.getText().toString();
                        h23 = "0.3";
                    } else {
                        mRb23_1 = findViewById(geth23);
                        h23 = mRb23_1.getText().toString();
                        h23 = "0.1";
                    }
                    //no24
                    int geth24 = mRg24.getCheckedRadioButtonId();
                    if (mRg24.getCheckedRadioButtonId() == findViewById(R.id.rb24_1).getId()) {
                        mRb24_1 = findViewById(geth24);
                        h24 = mRb24_1.getText().toString();
                        h24 = "0.5";
                    } else {
                        mRb24_1 = findViewById(geth24);
                        h24 = mRb24_1.getText().toString();
                        h24 = "0.1";
                    }
                    //no25
                    int geth25 = mRg25.getCheckedRadioButtonId();
                    if (mRg25.getCheckedRadioButtonId() == findViewById(R.id.rb25_1).getId()) {
                        mRb25_1 = findViewById(geth25);
                        h25 = mRb25_1.getText().toString();
                        h25 = "0.4";
                    } else {
                        mRb25_1 = findViewById(geth25);
                        h25 = mRb25_1.getText().toString();
                        h25 = "0.1";
                    }
                    //no26
                    int geth26 = mRg26.getCheckedRadioButtonId();
                    if (mRg26.getCheckedRadioButtonId() == findViewById(R.id.rb26_1).getId()) {
                        mRb26_1 = findViewById(geth26);
                        h26 = mRb26_1.getText().toString();
                        h26 = "0.3";
                    } else {
                        mRb26_1 = findViewById(geth26);
                        h26 = mRb26_1.getText().toString();
                        h26 = "0.1";
                    }
                    //no27
                    int geth27 = mRg27.getCheckedRadioButtonId();
                    if (mRg27.getCheckedRadioButtonId() == findViewById(R.id.rb27_1).getId()) {
                        mRb27_1 = findViewById(geth27);
                        h27 = mRb27_1.getText().toString();
                        h27 = "0.2";
                    } else {
                        mRb27_1 = findViewById(geth27);
                        h27 = mRb27_1.getText().toString();
                        h27 = "0.1";
                    }
                    //no28
                    int geth28 = mRg28.getCheckedRadioButtonId();
                    if (mRg28.getCheckedRadioButtonId() == findViewById(R.id.rb28_1).getId()) {
                        mRb28_1 = findViewById(geth28);
                        h28 = mRb28_1.getText().toString();
                        h28 = "0.4";
                    } else {
                        mRb28_1 = findViewById(geth28);
                        h28 = mRb28_1.getText().toString();
                        h28 = "0.1";
                    }
                    //no29
                    int geth29 = mRg29.getCheckedRadioButtonId();
                    if (mRg29.getCheckedRadioButtonId() == findViewById(R.id.rb29_1).getId()) {
                        mRb29_1 = findViewById(geth29);
                        h29 = mRb29_1.getText().toString();
                        h29 = "1.0";
                    } else {
                        mRb29_1 = findViewById(geth29);
                        h29 = mRb29_1.getText().toString();
                        h29 = "0.1";
                    }
                    //no30
                    int geth30 = mRg30.getCheckedRadioButtonId();
                    if (mRg30.getCheckedRadioButtonId() == findViewById(R.id.rb30_1).getId()) {
                        mRb30_1 = findViewById(geth30);
                        h30 = mRb30_1.getText().toString();
                        h30 = "0.4";
                    } else {
                        mRb30_1 = findViewById(geth30);
                        h30 = mRb30_1.getText().toString();
                        h30 = "0.1";
                    }
                    //no31
                    int geth31 = mRg31.getCheckedRadioButtonId();
                    if (mRg31.getCheckedRadioButtonId() == findViewById(R.id.rb31_1).getId()) {
                        mRb31_1 = findViewById(geth31);
                        h31 = mRb31_1.getText().toString();
                        h31 = "0.4";
                    } else {
                        mRb31_1 = findViewById(geth31);
                        h31 = mRb31_1.getText().toString();
                        h31 = "0.1";
                    }
                    //no32
                    int geth32 = mRg32.getCheckedRadioButtonId();
                    if (mRg32.getCheckedRadioButtonId() == findViewById(R.id.rb32_1).getId()) {
                        mRb32_1 = findViewById(geth32);
                        h32 = mRb32_1.getText().toString();
                        h32 = "0.6";
                    } else {
                        mRb32_1 = findViewById(geth32);
                        h32 = mRb32_1.getText().toString();
                        h32 = "0.1";
                    }
                    //no33
                    int geth33 = mRg33.getCheckedRadioButtonId();
                    if (mRg33.getCheckedRadioButtonId() == findViewById(R.id.rb33_1).getId()) {
                        mRb33_1 = findViewById(geth33);
                        h33 = mRb33_1.getText().toString();
                        h33 = "0.4";
                    } else {
                        mRb33_1 = findViewById(geth33);
                        h33 = mRb33_1.getText().toString();
                        h33 = "0.1";
                    }
                    //no34
                    int geth34 = mRg34.getCheckedRadioButtonId();
                    if (mRg34.getCheckedRadioButtonId() == findViewById(R.id.rb34_1).getId()) {
                        mRb34_1 = findViewById(geth34);
                        h34 = mRb34_1.getText().toString();
                        h34 = "0.3";
                    } else {
                        mRb34_1 = findViewById(geth34);
                        h34 = mRb34_1.getText().toString();
                        h34 = "0.1";
                    }
                    //no35
                    int geth35 = mRg35.getCheckedRadioButtonId();
                    if (mRg35.getCheckedRadioButtonId() == findViewById(R.id.rb35_1).getId()) {
                        mRb35_1 = findViewById(geth35);
                        h35 = mRb35_1.getText().toString();
                        h35 = "0.3";
                    } else {
                        mRb35_1 = findViewById(geth35);
                        h35 = mRb35_1.getText().toString();
                        h35 = "0.1";
                    }
                    //no36
                    int geth36 = mRg36.getCheckedRadioButtonId();
                    if (mRg36.getCheckedRadioButtonId() == findViewById(R.id.rb36_1).getId()) {
                        mRb36_1 = findViewById(geth36);
                        h36 = mRb36_1.getText().toString();
                        h36 = "0.3";
                    } else {
                        mRb36_1 = findViewById(geth36);
                        h36 = mRb36_1.getText().toString();
                        h36 = "0.1";
                    }
                    //no37
                    int geth37 = mRg37.getCheckedRadioButtonId();
                    if (mRg37.getCheckedRadioButtonId() == findViewById(R.id.rb37_1).getId()) {
                        mRb37_1 = findViewById(geth37);
                        h37 = mRb37_1.getText().toString();
                        h37 = "0.8";
                    } else {
                        mRb37_1 = findViewById(geth37);
                        h37 = mRb37_1.getText().toString();
                        h37 = "0.1";
                    }
                    if (mRg1 != null && mRg2 != null && mRg3 != null && mRg4 != null
                            && mRg5 != null && mRg6 != null && mRg7 != null && mRg8 != null
                            && mRg9 != null && mRg10 != null && mRg11 != null && mRg12 != null
                            && mRg13 != null && mRg14 != null && mRg15 != null && mRg16 != null
                            && mRg17 != null && mRg18 != null && mRg19 != null && mRg20 != null
                            && mRg21 != null && mRg22 != null && mRg23 != null && mRg24 != null
                            && mRg25 != null && mRg26 != null && mRg27 != null && mRg28 != null
                            && mRg29 != null && mRg30 != null && mRg31 != null && mRg32 != null
                            && mRg33 != null && mRg34 != null && mRg35 != null && mRg36 != null
                            && mRg37 != null) {

                        //Ubah String ke Integer
                        Double i1 = Double.parseDouble(h1);
                        Double i2 = Double.parseDouble(h2);
                        Double i3 = Double.parseDouble(h3);
                        Double i4 = Double.parseDouble(h4);
                        Double i5 = Double.parseDouble(h5);
                        Double i6 = Double.parseDouble(h6);
                        Double i7 = Double.parseDouble(h7);
                        Double i8 = Double.parseDouble(h8);
                        Double i9 = Double.parseDouble(h9);
                        Double i10 = Double.parseDouble(h10);
                        Double i11 = Double.parseDouble(h11);
                        Double i12 = Double.parseDouble(h12);
                        Double i13 = Double.parseDouble(h13);
                        Double i14 = Double.parseDouble(h14);
                        Double i15 = Double.parseDouble(h15);
                        Double i16 = Double.parseDouble(h16);
                        Double i17 = Double.parseDouble(h17);
                        Double i18 = Double.parseDouble(h18);
                        Double i19 = Double.parseDouble(h19);
                        Double i20 = Double.parseDouble(h20);
                        Double i21 = Double.parseDouble(h21);
                        Double i22 = Double.parseDouble(h22);
                        Double i23 = Double.parseDouble(h23);
                        Double i24 = Double.parseDouble(h24);
                        Double i25 = Double.parseDouble(h25);
                        Double i26 = Double.parseDouble(h26);
                        Double i27 = Double.parseDouble(h27);
                        Double i28 = Double.parseDouble(h28);
                        Double i29 = Double.parseDouble(h29);
                        Double i30 = Double.parseDouble(h30);
                        Double i31 = Double.parseDouble(h31);
                        Double i32 = Double.parseDouble(h32);
                        Double i33 = Double.parseDouble(h33);
                        Double i34 = Double.parseDouble(h34);
                        Double i35 = Double.parseDouble(h35);
                        Double i36 = Double.parseDouble(h36);
                        Double i37 = Double.parseDouble(h37);

                        bayes1 = i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8;
                        bayes2 = i9 + i10 + i11 + i12 + i13 + i14 + i15 + i16 + i17 + i18;
                        bayes3 = i19 + i20 + i21 + i22 + i23 + i24 + i25 + i26 + i27;
                        bayes4 = i28 + i29 + i30 + i31 + i32;
                        bayes5 = i33 + i34 + i35 + i36 + i37;

                        Gbayes1 = i1 / bayes1;
                        Gbayes2 = i2 / bayes1;
                        Gbayes3 = i3 / bayes1;
                        Gbayes4 = i4 / bayes1;
                        Gbayes5 = i5 / bayes1;
                        Gbayes6 = i6 / bayes1;
                        Gbayes7 = i7 / bayes1;

                        Gbayes9 = i9 / bayes2;
                        Gbayes10 = i10 / bayes2;
                        Gbayes11 = i11 / bayes2;
                        Gbayes12 = i12 / bayes2;
                        Gbayes13 = i13 / bayes2;
                        Gbayes14 = i14 / bayes2;
                        Gbayes15 = i15 / bayes2;
                        Gbayes16 = i16 / bayes2;
                        Gbayes17 = i17 / bayes2;
                        Gbayes18 = i18 / bayes2;

                        Gbayes19 = i19 / bayes3;
                        Gbayes20 = i20 / bayes3;
                        Gbayes21 = i21 / bayes3;
                        Gbayes22 = i22 / bayes3;
                        Gbayes23 = i23 / bayes3;
                        Gbayes24 = i24 / bayes3;
                        Gbayes25 = i25 / bayes3;
                        Gbayes26 = i26 / bayes3;
                        Gbayes27 = i27 / bayes3;

                        Gbayes28 = i28 / bayes4;
                        Gbayes29 = i29 / bayes4;
                        Gbayes30 = i30 / bayes4;
                        Gbayes31 = i31 / bayes4;
                        Gbayes32 = i32 / bayes4;

                        Gbayes33 = i33 / bayes5;
                        Gbayes34 = i34 / bayes5;
                        Gbayes35 = i35 / bayes5;
                        Gbayes36 = i36 / bayes5;
                        Gbayes37 = i37 / bayes5;

                        Ebayes1 = (Gbayes1 * i1) + (Gbayes2 * i2) + (Gbayes3 * i3) + (Gbayes4 * i4)
                                + (Gbayes5 * i5) + (Gbayes6 * i6) + (Gbayes7 * i7) + (Gbayes8 * i8);
                        Ebayes2 = (Gbayes9 * i9) + (Gbayes10 * i10) + (Gbayes11 * i11) + (Gbayes12 * i12) + (Gbayes13 * i13) + (Gbayes14 * i14)
                                + (Gbayes15 * i15) + (Gbayes16 * i16) + (Gbayes17 * i17) + (Gbayes18 * i18);
                        Ebayes3 = (Gbayes19 * i19) + (Gbayes20 * i20) + (Gbayes21 * i21)
                                + (Gbayes22 * i22) + (Gbayes23 * i23) + (Gbayes24 * i24)
                                + (Gbayes25 * i25) + (Gbayes26 * i26) + (Gbayes27 * i27);
                        Ebayes4 = (Gbayes28 * i28) + (Gbayes29 * i29) + (Gbayes30 * i30) +
                                (Gbayes31 * i31) + (Gbayes32 * i32);
                        Ebayes5 = (Gbayes33 * i33) + (Gbayes34 * i34) + (Gbayes35 * i35) + (Gbayes36 * i36)
                                + (Gbayes37 * i37);

                        Pbayes1 = (Gbayes1 * i1) / Ebayes1;
                        Pbayes2 = (Gbayes2 * i2) / Ebayes1;
                        Pbayes3 = (Gbayes3 * i3) / Ebayes1;
                        Pbayes4 = (Gbayes4 * i4) / Ebayes1;
                        Pbayes5 = (Gbayes5 * i5) / Ebayes1;
                        Pbayes6 = (Gbayes6 * i6) / Ebayes1;
                        Pbayes7 = (Gbayes7 * i7) / Ebayes1;
                        Pbayes8 = (Gbayes8 * i8) / Ebayes1;

                        Pbayes9 = (Gbayes9 * i9) / Ebayes2;
                        Pbayes10 = (Gbayes10 * i10) / Ebayes2;
                        Pbayes11 = (Gbayes11 * i11) / Ebayes2;
                        Pbayes12 = (Gbayes12 * i12) / Ebayes2;
                        Pbayes13 = (Gbayes13 * i13) / Ebayes2;
                        Pbayes14 = (Gbayes14 * i14) / Ebayes2;
                        Pbayes15 = (Gbayes15 * i15) / Ebayes2;
                        Pbayes16 = (Gbayes16 * i16) / Ebayes2;
                        Pbayes17 = (Gbayes17 * i17) / Ebayes2;
                        Pbayes18 = (Gbayes18 * i18) / Ebayes2;

                        Pbayes19 = (Gbayes19 * i19) / Ebayes3;
                        Pbayes20 = (Gbayes20 * i20) / Ebayes3;
                        Pbayes21 = (Gbayes21 * i21) / Ebayes3;
                        Pbayes22 = (Gbayes22 * i22) / Ebayes3;
                        Pbayes23 = (Gbayes23 * i23) / Ebayes3;
                        Pbayes24 = (Gbayes24 * i24) / Ebayes3;
                        Pbayes25 = (Gbayes25 * i25) / Ebayes3;
                        Pbayes26 = (Gbayes26 * i26) / Ebayes3;
                        Pbayes27 = (Gbayes17 * i27) / Ebayes3;

                        Pbayes28 = (Gbayes28 * i28) / Ebayes4;
                        Pbayes29 = (Gbayes29 * i29) / Ebayes4;
                        Pbayes30 = (Gbayes30 * i30) / Ebayes4;
                        Pbayes31 = (Gbayes31 * i31) / Ebayes4;
                        Pbayes32 = (Gbayes32 * i32) / Ebayes4;

                        Pbayes33 = (Gbayes33 * i33) / Ebayes5;
                        Pbayes34 = (Gbayes34 * i34) / Ebayes5;
                        Pbayes35 = (Gbayes35 * i35) / Ebayes5;
                        Pbayes36 = (Gbayes36 * i36) / Ebayes5;
                        Pbayes37 = (Gbayes37 * i37) / Ebayes5;

                        //
                        Nbayes1 = (i1 * Pbayes1) + (i2 * Pbayes2) + (i3 * Pbayes3) +
                                (i4 * Pbayes4) + (i5 * Pbayes5) + (i6 * Pbayes6) + (i7 * Pbayes7)
                                + (i8 * Pbayes8);
                        Nbayes2 = (i9 * Pbayes9) + (i10 * Pbayes10) + (i11 * Pbayes11) +
                                (i12 * Pbayes12) + (i13 * Pbayes13) + (i14 * Pbayes14) + (i15 * Pbayes15)
                                + (i16 * Pbayes16) + (i17 * Pbayes17) + (i18 * Pbayes18);
                        Nbayes3 = (i19 * Pbayes19) + (i20 * Pbayes20) + (i21 * Pbayes21) +
                                (i22 * Pbayes22) + (i23 * Pbayes23) + (i24 * Pbayes24) + (i25 * Pbayes25)
                                + (i26 * Pbayes26) + (i27 * Pbayes27);
                        Nbayes4 = (i28 * Pbayes28) + (i29 * Pbayes29) + (i30 * Pbayes30) + (i31 * Pbayes31) +
                                (i32 * Pbayes32);
                        Nbayes5 = (i33 * Pbayes33) + (i34 * Pbayes34) + (i35 * Pbayes35)
                                + (i36 * Pbayes36) + (i37 * Pbayes37);

                        if (Nbayes1 > Nbayes2 && Nbayes1 > Nbayes3 && Nbayes1 > Nbayes4 && Nbayes1 > Nbayes5){
                            hasil = "Anda terkena penyakit lambung Gastritis, harap segera menemui dokter atau pelayanan kesehatan terdekat. \n\nAnda bisa " +
                                    " juga melihat pada data penyakit untuk mengetahui penyakit anda lebih detail";
                        }else if (Nbayes2 > Nbayes3 && Nbayes2 > Nbayes4 && Nbayes2 > Nbayes5 && Nbayes2 > Nbayes1){
                            hasil = "Anda terkena penyakit lambung Dispepsia, harap segera menemui dokter atau pelayanan kesehatan terdekat. \n\nAnda bisa " +
                                    " juga melihat pada data penyakit untuk mengetahui penyakit anda lebih detail";
                        }else if (Nbayes3 > Nbayes4 && Nbayes3 > Nbayes2 && Nbayes3 > Nbayes5 && Nbayes3 > Nbayes1){
                            hasil = "Anda terkena penyakit lambung GERD atau asam lambung, harap segera menemui dokter atau pelayanan kesehatan terdekat. \n\nAnda bisa " +
                                    " juga melihat pada data penyakit untuk mengetahui penyakit anda lebih detail";
                        }else if (Nbayes4 > Nbayes5 && Nbayes4 > Nbayes1 && Nbayes4 > Nbayes2 && Nbayes4 > Nbayes3){
                            hasil = "Anda terkena penyakit lambung Maag, harap segera menemui dokter atau pelayanan kesehatan terdekat. \n\nAnda bisa " +
                                    " juga melihat pada data penyakit untuk mengetahui penyakit anda lebih detail";
                        }else if (Nbayes5 > Nbayes1 && Nbayes5 > Nbayes2 && Nbayes5 > Nbayes3 && Nbayes5 > Nbayes4){
                            hasil = "Anda terkena penyakit lambung Tukak Lambung, harap segera menemui dokter atau pelayanan kesehatan terdekat. \n\nAnda bisa " +
                                    " juga melihat pada data penyakit untuk mengetahui penyakit anda lebih detail";
                        }else{
                            hasil = "Selamat, Anda tidak terkena penyakit lambung, jaga kondisi anda baik-baik \n\nAnda bisa juga melihat pada data penyakit untuk mengetahui penyakit lambung lebih detail ";
                        }
                        Intent intent = new Intent(Dummy.this, LaporanDiagnosis.class);
                        intent.putExtra(KEY_RESULT, hasil);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplication(), "Isi semua pilihan", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Isikah semua gejala anda", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //next
        next1 = findViewById(R.id.next1);
        next2 = findViewById(R.id.next2);
        next3 = findViewById(R.id.next3);
        next4 = findViewById(R.id.next4);
        next5 = findViewById(R.id.next5);
        next6 = findViewById(R.id.next6);
        next7 = findViewById(R.id.next7);

        //back
        back1 = findViewById(R.id.back1);
        back2 = findViewById(R.id.back2);
        back3 = findViewById(R.id.back3);
        back4 = findViewById(R.id.back4);
        back5 = findViewById(R.id.back5);
        back6 = findViewById(R.id.back6);
        back7 = findViewById(R.id.back7);


        //linear
        pg1 = findViewById(R.id.linear1);
        pg2 = findViewById(R.id.linear2);
        pg3 = findViewById(R.id.linear3);
        pg4 = findViewById(R.id.linear4);
        pg5 = findViewById(R.id.linear5);
        pg6 = findViewById(R.id.linear6);
        pg7 = findViewById(R.id.linear7);
        pg8 = findViewById(R.id.linear8);

        //setOnNext
        next1.setOnClickListener(this);
        next2.setOnClickListener(this);
        next3.setOnClickListener(this);
        next4.setOnClickListener(this);
        next5.setOnClickListener(this);
        next6.setOnClickListener(this);
        next7.setOnClickListener(this);

        //SetOnBack
        back1.setOnClickListener(this);
        back2.setOnClickListener(this);
        back3.setOnClickListener(this);
        back4.setOnClickListener(this);
        back5.setOnClickListener(this);
        back6.setOnClickListener(this);
        back7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next1:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.VISIBLE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.next2:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.VISIBLE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.next3:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.VISIBLE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.next4:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.VISIBLE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.next5:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.VISIBLE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.next6:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.VISIBLE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.next7:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.VISIBLE);
                break;



            case R.id.back1:
                pg1.setVisibility(View.VISIBLE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;

            case R.id.back2:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.VISIBLE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;

            case R.id.back3:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.VISIBLE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;

            case R.id.back4:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.VISIBLE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.back5:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.VISIBLE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.back6:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.VISIBLE);
                pg7.setVisibility(View.GONE);
                pg8.setVisibility(View.GONE);
                break;
            case R.id.back7:
                pg1.setVisibility(View.GONE);
                pg2.setVisibility(View.GONE);
                pg3.setVisibility(View.GONE);
                pg4.setVisibility(View.GONE);
                pg5.setVisibility(View.GONE);
                pg6.setVisibility(View.GONE);
                pg7.setVisibility(View.VISIBLE);
                pg8.setVisibility(View.GONE);
                break;

        }
    }
}
