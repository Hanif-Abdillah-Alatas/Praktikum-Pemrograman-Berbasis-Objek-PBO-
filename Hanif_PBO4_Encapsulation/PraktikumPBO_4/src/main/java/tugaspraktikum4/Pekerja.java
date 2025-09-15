/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author user
 */
public class Pekerja extends Manusia {
    int gaji;   // hanya bisa diakses di dalam class ini

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter & Setter gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Nama: " + getNama() + 
               "\nUsia: " + usia +
               "\nPekerjaan: " + pekerjaan +
               "\nGaji: " + gaji;
    }
}