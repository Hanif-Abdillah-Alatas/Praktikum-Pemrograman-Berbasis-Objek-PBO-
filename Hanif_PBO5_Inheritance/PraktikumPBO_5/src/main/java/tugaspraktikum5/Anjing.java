/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author user
 */
public class Anjing extends Hewan {
    public Anjing(String nama, String jenis) {
        super(nama, jenis);
    }

    // Override
    @Override
    public void tampilkanInfo() {
        System.out.println("Informasi Anjing");
        System.out.println("Nama Anjing : " + nama);
        System.out.println("Jenis Anjing : " + jenis);
        suara();
    }

    // Method tambahan
    public void suara() {
        System.out.println("Suara Anjing: Guk guk!");
    }
}
