package com.Rafi.PBO.Pertemuan2;

import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user_benar = "rafi";
        String pass_benar = "21102012";

        System.out.println("Masukan Username Anda : ");
        String user = input.nextLine();
        System.out.println("Masukan Password Anda : ");
        String pass = input.nextLine();

        if (user.equals(user_benar) && pass.equals(pass_benar)) {
            System.out.println("Login berhasil silakan masuk");
        } else if (user != (user_benar) && pass.equals(pass_benar)) {
            System.out.println("Username Anda salah");
        } else if (user.equals(user_benar) && pass != (pass_benar)) {
            System.out.println("Password Anda salah");
        } else {
            System.out.println("Silakan login dengan username dan password yang sah!");
        }
    }
}