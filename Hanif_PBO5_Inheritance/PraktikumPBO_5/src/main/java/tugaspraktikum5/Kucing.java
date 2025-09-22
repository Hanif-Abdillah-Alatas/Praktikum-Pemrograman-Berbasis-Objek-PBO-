/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author user
 */
public class Kucing extends Hewan {
    public Kucing(String nama, String jenis) {
        super(nama, jenis);
    }

    // Override
    @Override
    public void tampilkanInfo() {
        System.out.println("Informasi Kucing");
        System.out.println("Nama Kucing : " + nama);
        System.out.println("Jenis Kucing : " + jenis);
        suara();
    }

    // Method tambahan
    public void suara() {
        System.out.println("Suara Kucing: Meong~");
    }
}
