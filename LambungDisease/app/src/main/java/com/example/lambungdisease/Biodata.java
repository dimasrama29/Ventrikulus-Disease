package com.example.lambungdisease;

import java.io.Serializable;

public class Biodata implements Serializable {

    private String nama;
    private String tanggalLahir;
    private String alamat;
    private String noTelp;
    private String email;
    private String pekerjaan;
    private String gender;
    private String key;

    public Biodata(){

    }

    public String getKey(){
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }

    //nama
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    //tgl lahir
    public String getTanggalLahir(){
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    //alamat
    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //noTelp
    public String getNoTelp(){
        return noTelp;
    }

    public void setNoTelp(String noTelp){
        this.noTelp  = noTelp;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //pkj
    public String getPekerjaan(){
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public Biodata(String nm, String tgl, String almt, String tlp, String eml, String pkj, String gdr){
        nama = nm;
        tanggalLahir = tgl;
        alamat = almt;
        noTelp = tlp;
        email = eml;
        pekerjaan = pkj;
        gender = gdr;
    }




}
