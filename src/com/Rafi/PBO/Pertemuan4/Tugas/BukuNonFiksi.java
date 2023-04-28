package com.Rafi.PBO.Pertemuan4.Tugas;

public class BukuNonFiksi extends Buku{
    protected String subjek;

    public BukuNonFiksi(String judul, String pengarang, String subjek) {
        super(judul, pengarang);
        this.subjek = subjek;
    }

    public String getSubjek() {
        return subjek;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subjek: " + subjek);
    }
}
