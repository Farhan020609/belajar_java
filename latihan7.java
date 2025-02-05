package com.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class latihan7 {
    public static void main(String[] args) throws IOException {
        String nama;
        int umur;
        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //membuat objek BufferReader
        BufferedReader br = new BufferedReader(isr);
        //mengisi variabel nama dengan BufferReader
        System.out.print("siapa nama lo");
        nama = br.readLine();
        System.out.println("salam kenal yeee" + nama);
        System.out.print("berapa umur lo");
        umur = Integer.parseInt(br.readLine());
        System.out.println(  umur + "? OMG udah tua?");
     }
}
 