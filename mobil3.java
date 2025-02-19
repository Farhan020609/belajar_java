package com.belajar;

public class mobil3 {
    //variabel static
    static String warna = "hitam";
    static int tahin_produksi = 2000;
    //method static
    static void ubah(){
        warna = "pink";
    }
    static void tampil(){
        System.out.println(warna);
        System.out.println(tahin_produksi);
    }
    public static void main(String[] args) {
        mobil3.ubah();
        mobil3.tampil();
    }
}
