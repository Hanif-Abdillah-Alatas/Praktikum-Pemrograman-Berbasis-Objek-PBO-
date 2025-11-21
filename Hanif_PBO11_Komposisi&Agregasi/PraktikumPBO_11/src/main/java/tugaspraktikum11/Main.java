/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum11;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Membuat pengarang (agregasi)
        Pengarang pengarang1 = new Pengarang("Andrea Hirata");
        Pengarang pengarang2 = new Pengarang("Tere Liye");

        // Membuat buku (mengacu pada pengarang)
        Buku buku1 = new Buku("Bumi", pengarang2);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang1);
        Buku buku3 = new Buku("Edensor", pengarang1);
        Buku buku4 = new Buku("Dunia Anna", null);

        // Membuat perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);

        // Menampilkan semua buku
        perpustakaan.infoPerpustakaan();

        System.out.println("Menghapus Perpustakaan");
        perpustakaan = null; // Komposisi: buku akan hilang
        
        // Pengarang masih bisa diakses
        System.out.println("\nPengarang");
        pengarang1.infoPengarang();
        pengarang2.infoPengarang();
    }
}