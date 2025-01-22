package com.belajar;
import java.util.Scanner;
public class ifelsepakroni {
    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        
        // Kondisi if-else untuk memeriksa apakah angka lebih besar, lebih kecil, atau sama dengan 0
        if (angka > 0) {
            System.out.println(angka + " adalah angka positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah angka negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah 0.");
        }

        // Menutup scanner setelah digunakan
        scanner.close();
    }
}

