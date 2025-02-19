package com.belajar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    String nama;
    int harga;

    Item(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class MiniMarket {
    private static List<Item> daftarBelanja = new ArrayList<>();
    private static int total = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueShopping = true;

        // Daftar barang
        Item[] items = {
            new Item("GULA", 5000),
            new Item("KOPI", 2000),
            new Item("TEH", 1000),
            new Item("MIE", 4000),
            new Item("GARAM", 3000)
        };

        while (continueShopping) {
            System.out.println("======= MINI MARKET=======");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i].nama + " - Harga: " + items[i].harga);
            }
            System.out.println("=========================");
            System.out.println("Anda beli apa? (1-5)");
            int pilihan = scanner.nextInt();

            if (pilihan < 1 || pilihan > items.length) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.println("Kuantitas:");
            int kuantitas = scanner.nextInt();
            int itemTotal = kuantitas * items[pilihan - 1].harga;
            total += itemTotal;
            daftarBelanja.add(new Item(items[pilihan - 1].nama, itemTotal));

            System.out.println("Total saat ini: " + total);
            System.out.println("1. Bayar");
            System.out.println("2. Tambah belanjaan (barang yang sama)");
            System.out.println("3. Tambah belanjaan (barang berbeda)");
            System.out.println("4. Tidak jadi");
            int tindakan = scanner.nextInt();

            if (tindakan == 1) {
                bayar(scanner);
                continueShopping = false; // Selesai berbelanja
            } else if (tindakan == 2) {
                // Lanjutkan belanja dengan barang yang sama
                continueShopping = true;
            } else if (tindakan == 3) {
                // Lanjutkan belanja dengan barang berbeda
                continueShopping = true;
            } else if (tindakan == 4) {
                System.out.println("Terima kasih! Belanja dibatalkan.");
                continueShopping = false; // Selesai berbelanja
            }
        }

        scanner.close();
    }

    private static void bayar(Scanner scanner) {
        System.out.println("Daftar Belanja:");
        for (Item item : daftarBelanja) {
            System.out.println(item.nama + " - Total: " + item.harga);
        }

        System.out.println("Total Belanja: " + total);
        System.out.println("Masukkan uang anda:");
        int uang = scanner.nextInt();
        int sisa = uang - total;

        if (sisa < 0) {
            System.out.println("Uang tidak cukup!");
        } else {
            // Diskon 10% jika total lebih dari 20000
            if (total > 20000) {
                double diskon = total * 0.1;
                total -= diskon;
                System.out.println("Diskon 10% diterapkan: " + diskon);
            }
            System.out.println("Kembalian: " + sisa);
            System.out.println("Terima kasih telah berbelanja di sini😁😁");
        }
    }
}