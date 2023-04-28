package com.Rafi.PBO.Pertemuan4.Coba;

public class Koran extends Item{
    private String penerbit;

    public Koran(String judul, String pengarang, int tahun, String penerbit) {
        super(judul, pengarang, tahun);
        this.penerbit = penerbit;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Publisher : " + penerbit);
    }
}
