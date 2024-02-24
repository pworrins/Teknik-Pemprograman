/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penjualan;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        Penjualan penjualan = new Penjualan();

        // Menambahkan menu makanan
        restaurant.tambahMenuMakanan("Nasi Goreng", 15000, 10);
        restaurant.tambahMenuMakanan("Mie Goreng", 12000, 15);
        restaurant.tambahMenuMakanan("Ayam Goreng", 20000, 8);
        restaurant.tambahMenuMakanan("Soto Ayam", 18000, 12);
        restaurant.tambahMenuMakanan("Nasi Uduk", 16000, 10);
        restaurant.tambahMenuMakanan("Bakso", 15000, 20);
        restaurant.tambahMenuMakanan("Gado-gado", 14000, 15);
        restaurant.tambahMenuMakanan("Rawon", 20000, 10);
        restaurant.tambahMenuMakanan("Sate Ayam", 18000, 20);
        restaurant.tambahMenuMakanan("Capcay", 16000, 15);

        boolean lanjutPesan = true;
        while (lanjutPesan) {
            // Menampilkan menu makanan
            restaurant.tampilMenuMakanan();

            System.out.print("Masukkan nama makanan yang ingin dipesan: ");
            String namaMakanan = scanner.nextLine();

            if (restaurant.isMakananTersedia(namaMakanan)) {
                System.out.print("Masukkan jumlah pesanan untuk " + namaMakanan + ": ");
                int jumlahPesanan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline di buffer

                if (restaurant.kurangiStok(namaMakanan, jumlahPesanan)) {
                    double hargaProduk = restaurant.getHargaMakanan(namaMakanan) * jumlahPesanan;
                        penjualan.tambahPesanan(namaMakanan, jumlahPesanan, (int) hargaProduk);
                } else {
                    System.out.println("Maaf, pesanan melebihi stok yang tersedia.");
                }
            } else {
                System.out.println("Maaf, makanan tidak tersedia.");
            }

            System.out.print("Ingin menambah pesanan? (ya/tidak): ");
            String tambahPesanan = scanner.nextLine();
            if (!tambahPesanan.equalsIgnoreCase("ya")) {
                lanjutPesan = false;
            }
        }
        // Menampilkan semua pesanan
        penjualan.tampilkanPesanan();
        penjualan.totalBayar();
    }
}
