/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Membuat perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Membuat buku
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Struktur Data");
        Buku buku3 = new Buku("Basis Data");

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi buku di perpustakaan
        System.out.println("Daftar Buku di Perpustakaan");
        perpustakaan.infoPerpustakaan();

        System.out.println();

        // Membuat klub
        Klub klubCoding = new Klub("Klub Coding");

        // Membuat anggota
        Anggota anggota1 = new Anggota("Hanif");
        Anggota anggota2 = new Anggota("Andra");
        Anggota anggota3 = new Anggota("Bagus");

        // Menambahkan anggota ke klub
        klubCoding.tambahAnggota(anggota1);
        klubCoding.tambahAnggota(anggota2);
        klubCoding.tambahAnggota(anggota3);

        // Menampilkan informasi klub
        System.out.println("Anggota Klub");
        klubCoding.infoKlub();
    }
}