package com.Rafi.PBO.Pertemuan4.Coba;

public class Item {
    protected String judul;
    protected String pengarang;
    protected int tahun;

    public Item(String judul, String pengarang, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
    }

    public void displayInfo() {
        System.out.println("\nTitle: " + judul);
        System.out.println("Author: " + pengarang);
        System.out.println("Year: " + tahun);
    }
}
