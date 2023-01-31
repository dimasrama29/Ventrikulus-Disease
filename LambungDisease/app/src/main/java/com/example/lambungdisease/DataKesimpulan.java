package com.example.lambungdisease;

import java.io.Serializable;

public class DataKesimpulan implements Serializable{

    private String kesimpulan;
    private String key;

    public DataKesimpulan(){

    }

    public String getKey(){
        return key;
    }

    public void setKey(String key){
        this.key = key;
    }

    public String getKesimpulan(){
        return kesimpulan;
    }

    public void setKesimpulan(String kesimpulan){
        this.kesimpulan = kesimpulan;
    }

    public String toString(){
        return " " + kesimpulan;
    }

    public DataKesimpulan(String kesim){
        kesimpulan = kesim;
    }
}