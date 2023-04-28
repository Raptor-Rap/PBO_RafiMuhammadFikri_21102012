package com.Rafi.PBO.Pertemuan4.Coba;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class Buku
        Buku buku1 = new Buku("The Catcher in the Rye", "J.D. Salinger", 1951, "Fiction");
        // Menampilkan informasi buku
        buku1.displayInfo();

        // Membuat objek dari class Majalah
        Majalah majalah1 = new Majalah("National Geographic", "National Geographic Society", 1888, "Science");
        // Menampilkan informasi majalah
        majalah1.displayInfo();

        // Membuat objek dari class Koran
        Koran koran1 = new Koran("The New York Times", "Arthur Ochs Sulzberger Jr.", 1851, "The New York Times Company");
        // Menampilkan informasi koran
        koran1.displayInfo();
    }
}
