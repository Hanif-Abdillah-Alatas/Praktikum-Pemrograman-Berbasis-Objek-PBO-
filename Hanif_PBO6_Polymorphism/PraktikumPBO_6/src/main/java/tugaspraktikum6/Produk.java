/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author user
 */
abstract class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public abstract double hitungDiskon();

    // Harga diskon
    public double getHargaDiskon() {
        return harga - hitungDiskon();
    }

    @Override
    public String toString() {
        return nama + " | Harga: " + harga + " | Setelah Diskon: " + getHargaDiskon();
    }
}