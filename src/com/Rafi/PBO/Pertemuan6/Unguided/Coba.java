package com.Rafi.PBO.Pertemuan6.Unguided;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Coba {
    public static int BagiBilangan(int bilangan1, int bilangan2) {
        return bilangan1 / bilangan2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = scanner.nextInt();

            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = scanner.nextInt();

            int hasil = BagiBilangan(bilangan1, bilangan2);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan bilangan bulat.");
        } catch (ArithmeticException e) {
            System.out.println("Terjadi pembagian dengan nol. Pembagian tidak mungkin.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
