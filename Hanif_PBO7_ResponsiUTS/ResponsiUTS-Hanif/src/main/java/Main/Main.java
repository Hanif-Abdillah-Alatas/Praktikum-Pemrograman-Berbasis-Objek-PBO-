    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Pegawai.Pegawai;
import Pegawai.PegawaiKontrak;
import Pegawai.PegawaiTetap;
import Produk.Elektronik;
import Produk.Makanan;
import Produk.Produk;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Object Produk
        Produk laptop = new Elektronik("Laptop", 5000000, 2);
        Produk ayam = new Makanan("Ayam", 15000, "2025-09-07");

        // Object Pegawai
        Pegawai hanif = new PegawaiTetap("Hanif", 4000000, 1000000);
        Pegawai andra = new PegawaiKontrak("Andra", 2000000, 24);

        // Output
        System.out.println("Output Produk");
        laptop.tampilkanInfo();

        System.out.println("\nOutput Pegawai");
        hanif.tampilkanInfo();

        System.out.println("\nOutput Polimorfisme");
        ayam.tampilkanInfo();
        System.out.println();
        andra.tampilkanInfo();
    }
}