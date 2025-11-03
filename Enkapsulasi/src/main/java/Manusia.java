/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
class Manusia {
    // Atribut
    private String nama;
    protected int usia; 
    public String alamat;

    // Konstruktor
    public Manusia(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk usia
    public int getUsia() {
        return usia;
    }

    // Method menampilkan informasi dasar
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Usia    : " + usia + " tahun");
        System.out.println("Alamat  : " + alamat);
    }
}