/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
class Perpustakaan {
    private List<Buku> daftarBuku; // Komposisi

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan");
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
            System.out.println();
        }
    }
}