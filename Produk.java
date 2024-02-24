/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penjualan;

/**
 *
 * @author USER
 */
public class Produk {
    private String namaProduk;
    private int qty;
    private double hargaProduk;

    public Produk(String namaProduk, int qty, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.qty = qty;
        this.hargaProduk = hargaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getQty() {
        return qty;
    }

    public double getHargaProduk() {
        return hargaProduk;
    }
}
