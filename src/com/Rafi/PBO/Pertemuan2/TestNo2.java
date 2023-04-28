package com.Rafi.PBO.Pertemuan2;

import java.util.Scanner;
public class TestNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan gaji Anda: ");
        int gaji = input.nextInt();
        System.out.print("Masukkan tunjangan Anda: ");
        int tunjangan = input.nextInt();
        double pajak = 7.65 / 100;

        int gaji_kotor = gaji + tunjangan;
        double pajak_negara = gaji_kotor * pajak;
        double gaji_bersih = gaji_kotor - pajak_negara;

        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gaji_bersih + ".");
    }
}
