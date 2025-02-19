package com.belajar;

public class mobil {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;
    public static void main(String[] args) {
        mobil mobilNiaga = new mobil();
        //pemangilan method void
        mobilNiaga.isi();
        mobilNiaga.tampil();
    }
    //mengisi variabel instance
    void isi(){
        warna = "pink";
        tahunProduksi = 1998;
        nomorMesin = 80926;
        nomorRangka = 1234;


    }
    //menampilkan isi variabel
    void tampil(){
        System.out.println("warna :" + warna);
        System.out.println("tahunProduksi :" + tahunProduksi );
        System.out.println("nomorMesin :" + nomorMesin);
        System.out.println("nomorRangka :" + nomorRangka);
    }

}
