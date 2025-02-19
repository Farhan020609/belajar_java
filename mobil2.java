package com.belajar;

public class mobil2 {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorRangka;
    //metod mengisi variabel instance
    void isi(String warna, int tahunProduksi, int nomorMesin, int nomorRangka)
    {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;

    }
    //method menampilkan isi variabel
    String ambil_warna(){
        return warna;

    }
    int ambil_tahunProduksi(){
        return tahunProduksi;

    }
    int ambil_nomorMesin(){
        return nomorMesin;

    }
    int ambil_nomorRangka(){
        return nomorRangka;
    }
    public static void main(String[] args) {
        mobil2 tampilkan = new mobil2();
        tampilkan.isi("hitam", 1998, 80926, 1234);
        System.out.println("warna : " + tampilkan.ambil_warna());
        System.out.println("tahunProduksi : " + tampilkan.ambil_tahunProduksi());
        System.out.println("nomorMein: " + tampilkan.ambil_nomorMesin());
        System.out.println("nomorRangka : " + tampilkan.ambil_nomorRangka());

    }
}
