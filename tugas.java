package com.belajar;

public class tugas {
    static String warna_pensil = "biru";
    static int harga = 10000;

    static void ubah(){
        warna_pensil = "hitam";

    }
    static void tampil(){
        System.out.println(warna_pensil);
        System.out.println(harga);

    }
    public static void main(String[] args) {
        tugas.ubah();
        tugas.tampil();
    }
    
}

