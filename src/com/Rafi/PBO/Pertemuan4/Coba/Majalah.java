package com.Rafi.PBO.Pertemuan4.Coba;

public class Majalah extends Item{
    private String kategori;

    public Majalah(String judul, String pengarang, int tahun, String kategori) {
        super(judul, pengarang, tahun);
        this.kategori = kategori;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori : " + kategori);
    }
}