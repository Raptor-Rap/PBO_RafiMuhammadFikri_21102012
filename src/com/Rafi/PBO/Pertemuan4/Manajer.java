package com.Rafi.PBO.Pertemuan4;

public class Manajer extends Pegawai{
    public void bonus(int bonus){
        System.out.println("Pegawai atas nama : " + nama + " (" + nip + ") mendapat bonus sebesar " + bonus);
    }

    public void extrainfo(){
        System.out.println("Jabatan pegawai : Manajer");
    }

    public void bonus(){
        System.out.println("Error : harap masukan nominal bonus !");
    }
}