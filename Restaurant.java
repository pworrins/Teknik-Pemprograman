/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penjualan;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author USER
 */
public class Restaurant {
    private Map<String, Integer> stokMakanan;
    private Map<String, Double> hargaMakanan;

    public Restaurant() {
        stokMakanan = new HashMap<>();
        hargaMakanan = new HashMap<>();
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        stokMakanan.put(nama, stok);
        hargaMakanan.put(nama, harga);
    }

    public void tampilMenuMakanan() {
        System.out.println("Menu Makanan:");
        System.out.println("==============================");
        System.out.println("Nama Makanan | Stok | Harga |");
        for (Map.Entry<String, Integer> entry : stokMakanan.entrySet()) {
            String namaMakanan = entry.getKey();
            int stok = entry.getValue();
            double harga = hargaMakanan.get(namaMakanan);
            System.out.println(namaMakanan + " | " + stok + " | Rp. " + harga);
        }
        System.out.println("==============================");
    }

    public boolean isMakananTersedia(String nama) {
        return stokMakanan.containsKey(nama);
    }

    public double getHargaMakanan(String nama) {
        return hargaMakanan.get(nama);
    }

    public boolean kurangiStok(String nama, int jumlah) {
        if (stokMakanan.get(nama) >= jumlah) {
            stokMakanan.put(nama, stokMakanan.get(nama) - jumlah);
            return true;
        }
        return false;
    }
}

