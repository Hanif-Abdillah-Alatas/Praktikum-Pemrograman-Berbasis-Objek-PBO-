/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author user
 */
public class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.10; // Diskon 10%
    }
}