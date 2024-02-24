/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penjualan;

/**
 *
 * @author USER
 */
public class Penjualan {
    private String[] namaProduk;
    private int[] qty;
    private int[] totalHarga;
    private static byte index = 0;

    public Penjualan() {
        namaProduk = new String[10];
        qty = new int[10];
        totalHarga = new int[10];
    }

    public void tambahPesanan(String namaProduk, int qty, int totalHarga) {
        this.namaProduk[index] = namaProduk;
        this.qty[index] = qty;
        this.totalHarga[index] = totalHarga;
        index++;
    }

    public void tampilkanPesanan() {
        System.out.println("Daftar Pesanan:");
        System.out.println("==============================");
        System.out.println("No | Nama Produk | Qty | Total Harga");
        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + " | " + namaProduk[i] + " | " + qty[i] + " | Rp. " + totalHarga[i]);
        }
        System.out.println("==============================");
        
    }
    public void totalBayar() {
        double totalBayar = 0.0;
        for (int i = 0; i < index; i++) {
            totalBayar += totalHarga[i];
        }
        System.out.println("Total Bayar: Rp. " + totalBayar);
    }
}

