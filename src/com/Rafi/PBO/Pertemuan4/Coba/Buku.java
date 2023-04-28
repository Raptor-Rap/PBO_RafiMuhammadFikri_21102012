package com.Rafi.PBO.Pertemuan4.Coba;

public class Buku extends Item{
    private String genre;

    public Buku(String judul, String pengarang, int tahun, String genre) {
        super(judul, pengarang, tahun);
        this.genre = genre;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre : " + genre);
    }
}
