/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RestaurantFix;

/**
 *
 * @author USER
 */
public class Restaurant {
    
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    private int totalHarga = 0; // Variabel untuk menyimpan total harga pesanan

    public Restaurant(){
        nama_makanan= new String[10];
        harga_makanan= new double[10];
        stok= new int[10];
    } 
    public void setNamaMakanan(int index, String nama) {
        nama_makanan[index] = nama;
    }

    public String getNamaMakanan(int index) {
        return nama_makanan[index];
    }

    public void setHargaMakanan(int index, double harga) {
        harga_makanan[index] = harga;
    }

    public double getHargaMakanan(int index) {
        return harga_makanan[index];
    }

    public void setStok(int index, int stok) {
        this.stok[index] = stok;
    }

    public int getStok(int index) {
        return stok[index];
    }


    public void tambahMenuMakanan(String nama, double harga, int stok) {
        setNamaMakanan(id, nama);
        setHargaMakanan(id, harga);
        setStok(id, stok);
    }

    public void tampilMenuMakanan() {
        System.out.println("Menu Makanan:");
        System.out.println("==============================");
        System.out.println("No | Nama Makanan | Stok | Harga |");
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                if(getNamaMakanan(i).length()>8){
                System.out.println(getNamaMakanan(i) +"["+getStok(i)+"]"+"\tRp. "+getHargaMakanan(i));
                }
                else{
                    System.out.println(getNamaMakanan(i) +"["+getStok(i)+"]"+"\t\tRp. "+getHargaMakanan(i));
                }
            }
        }
        System.out.println("==============================");
    }

    public boolean isOutOfStock(int id){
        if(getStok(id) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }
    public void tampilPesanan(int i, int jumlah){
        System.out.printf("Anda telah memesan "+ getNamaMakanan(i)+"\nsebanyak["+jumlah+"]"+"\t\tdengan Total Rp. "+getHargaMakanan(i)*jumlah);
    }
    
     public void tampilHargaKeseluruhan() {
        System.out.println("Total Harga Keseluruhan: " + totalHarga);
    }

    public int kurangiStok(int id, int jumlah){
        
        if(getStok(id) - jumlah >=0){
            stok[id] -= jumlah;
            totalHarga += getHargaMakanan(id) * jumlah; // Menambahkan harga pesanan ke totalHarga
            return 1;
        }
        else{
            System.out.println("Pesanan melebihi stok yang tersedia.");
            return 0;
        }
    }
}
