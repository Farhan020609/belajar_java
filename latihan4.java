package com.belajar;
import java.util.Scanner;
public class latihan4 {
    public static void main(String[] args) {
        // mengolah input data sederhana 
        // menggunakan class scanner
        int NISN, Usia;
        String Nama, Alamat;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA SISWA");
        System.out.println("----------");
        System.out.print("NISN : ");
        NISN = Input.nextInt();
        Input.nextLine();
        System.out.print("Nama : ");
        Nama = Input.nextLine();
        System.out.print("Alamat : ");
        Alamat = Input.nextLIne();
        System.out.print("Usia : ");
        Usia = Input.nextInt();
        // menampilkan data siswa 
        System.out.println("\nDATA SISWA");
        System.out.println("----------");
        System.out.println("NISN : " + NISN);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Usia : " + Usia);
    }
}
