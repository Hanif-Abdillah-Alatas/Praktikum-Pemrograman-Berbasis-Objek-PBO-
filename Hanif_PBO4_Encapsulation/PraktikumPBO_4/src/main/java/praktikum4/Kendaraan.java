/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Kendaraan {
    // Atribut dengan akses modifier berbeda
    private String nama;
    protected int kecepatan;
    public String mesin;
    
    // Constructor
    public Kendaraan(String nama, int kecepatan, String mesin) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.mesin = mesin;
    }
    
    // Method Getter dan Setter (nama)
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method public untuk menampilkan informasi kendaraan
    public void InfoKendaraan() {
        System.out.println("Nama kendaraan: " + nama);
        System.out.println("Kecepatan maks: " + kecepatan + " km/jam");
        System.out.println("Jenis mesin: " + mesin);
    }
}