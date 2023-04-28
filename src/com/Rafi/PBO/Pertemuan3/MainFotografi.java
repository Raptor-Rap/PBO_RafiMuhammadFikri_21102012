package com.Rafi.PBO.Pertemuan3;

import java.util.Scanner;
import java.util.ArrayList;

public class MainFotografi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<LayananFotografi> paketList = new ArrayList<LayananFotografi>();


        LayananFotografi mini = new LayananFotografi ("Paket 1 : Paket Mini", "1 jam pemotretan dengan 20 foto hasil edit", 200000);
        LayananFotografi standar = new LayananFotografi ("Paket 2 : Paket Standar", "2 jam pemotretan dengan 40 foto hasil edit dan 5 foto cetak ukuran 10R", 400000);
        LayananFotografi eksklusif = new LayananFotografi ("paket 3 : Paket Eksklusif", "4 jam pemotretan dengan 80 foto hasil edit, 10 foto ceteak ukuran 10R, dan softcopy semua foto", 800000);

        // menambahkan paket layanan ke dalam list
        paketList.add(mini);
        paketList.add(standar);
        paketList.add(eksklusif);

        // Menampilkan daftar paket jasa
        System.out.println("DAFTAR PAKET LAYANAN FOTOGRAFI");
        for (int i = 0; i < paketList.size(); i++) {
            System.out.println((i+1) + ". " + paketList.get(i).toString());
        }

        // Meminta input dari pengguna untuk memilih paket jasa
        ArrayList<LayananFotografi> paketTerpilih = new ArrayList<>();
        boolean lanjutPilih = true;
        while (lanjutPilih) {
            System.out.print("Pilih nomor paket yang diinginkan (0 untuk melihat hasil pilihan dan total biaya): ");
            int paketIndex = input.nextInt() - 1;
            if (paketIndex >= 0 && paketIndex < paketList.size()) {
                paketTerpilih.add(paketList.get(paketIndex));
            } else if (paketIndex == -1) {
                lanjutPilih = false;
            } else {
                System.out.println("Pilihan tidak tersedia, silahkan pilih ulang!");
            }
        }

        // Menampilkan paket yang dipilih oleh user
        System.out.println("\nPaket yang anda pilih : ");
        for (int i = 0; i < paketTerpilih.size(); i++) {
            System.out.println((i+1) + ". " + paketTerpilih.get(i).toString());
        }

        // Menghitung total biaya dari paket yang dipilih
        int totalBiaya = 0;
        for (int i = 0; i < paketTerpilih.size(); i++) {
            totalBiaya += paketTerpilih.get(i).getBiaya();
        }
        System.out.println("Total biaya yang harus anda bayar Rp" + totalBiaya);
    }
}
