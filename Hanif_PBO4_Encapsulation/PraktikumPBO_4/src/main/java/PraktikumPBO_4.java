
import praktikum4.Kendaraan;
import praktikum4.Kendaraan1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author user
 */
public class PraktikumPBO_4 {

     public static void main(String[] args) {
        Kendaraan1 mobil = new Kendaraan1("Nissan", "GTR", 2025);
        
        // Menampilkan data awal
        System.out.println("Merk: " + mobil.getMerk());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun: " + mobil.getTahun());
        
        // Mengubah data
        mobil.setModel("Juke");
        mobil.setTahun(2024);
        
        // Menampilkan data setelah diubah
        System.out.println("Model baru: " + mobil.getModel());
        System.out.println("Tahun baru: " + mobil.getTahun());
    }
}
