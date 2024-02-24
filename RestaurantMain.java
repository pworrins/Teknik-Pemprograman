/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantFix;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RestaurantMain {
     public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        Restaurant menu= new Restaurant();
        int jumlah;
        int nomor;
        int pengecek;
        int ulang=1;

        
        menu.setNamaMakanan(0, "1. Bala-bala");
        menu.setHargaMakanan(0, 1000);
        menu.setStok(0, 20);
        menu.tambahMenuMakanan(menu.getNamaMakanan(0), menu.getHargaMakanan(0), menu.getStok(0));
        Restaurant.nextId();
        menu.setNamaMakanan(1, "2. Gehu");
        menu.setHargaMakanan(1, 1000);
        menu.setStok(1, 20);
        menu.tambahMenuMakanan(menu.getNamaMakanan(1), menu.getHargaMakanan(1), menu.getStok(1));
        Restaurant.nextId();
        menu.setNamaMakanan(2, "3. Tahu");
        menu.setHargaMakanan(2, 1000);
        menu.setStok(2, 20);
        menu.tambahMenuMakanan(menu.getNamaMakanan(2), menu.getHargaMakanan(2), menu.getStok(2));
        Restaurant.nextId();
        menu.setNamaMakanan(3, "4. Molen");
        menu.setHargaMakanan(3, 1000);
        menu.setStok(3, 20);
        menu.tambahMenuMakanan(menu.getNamaMakanan(3), menu.getHargaMakanan(3), menu.getStok(3));
        Restaurant.nextId();
        menu.tampilMenuMakanan();

        while(ulang==1){
        System.out.println("\nSilakan pilih menu yang ingin dipesan: ");
        System.out.print("Nomor: ");
        nomor=input.nextInt();
        
        System.out.print("Jumlah: ");
        jumlah=input.nextInt();
        pengecek=menu.kurangiStok(nomor-1, jumlah);

        if(pengecek==1){
            System.out.println("Pesanan Anda berhasil dicatat.");
            menu.tampilPesanan(nomor-1, jumlah);
            System.out.println("\nMenu tersisa");
            menu.tampilMenuMakanan();
        } 
           System.out.println("Pesan lagi? ya(1) tidak(0)");
        ulang =input.nextInt();
    }
        menu.tampilHargaKeseluruhan();
        System.out.println("Terima kasih telah mengunjungi restoran kami!");
        input.close();
}
}


