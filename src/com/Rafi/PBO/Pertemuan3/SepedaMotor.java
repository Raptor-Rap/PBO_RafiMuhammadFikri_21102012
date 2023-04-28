package com.Rafi.PBO.Pertemuan3;

public class SepedaMotor {
    // Atributs (Variable)
   private String merk;
   private String tipe;
   private int harga;

    // Constructor (berfungsi menginisialisasi)
    public SepedaMotor(){}

    // Constructor baru (Berparameter)
    public SepedaMotor(String merk, String tipe, int harga){
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    // Method getter(mengambil nilai dr atribut private) and setter(Mengatur isi variablenya)
    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    // Method
    public void showInfo(){
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
