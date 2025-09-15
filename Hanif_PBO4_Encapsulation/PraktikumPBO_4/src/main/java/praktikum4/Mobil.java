/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Mobil extends Kendaraan {
    private final int pintu; // Atribut tambahan untuk class mobil
    
    // Constructor
    public Mobil(String nama, int kecepatan, String mesin, int pintu) {
        super(nama, kecepatan, mesin); // Memanggil constructor dari class induk (superclass)
        this.pintu = pintu;
    }
    
    // Method menampilkan informasi mobil
    public void InfoMobil() {
        // Bisa mengakses atribut kecepatan karena akses protected
        System.out.println("Kecepatan maks: " + kecepatan + " km/jam");
        System.out.println("Jumlah pintu: " + pintu);
    }
}
