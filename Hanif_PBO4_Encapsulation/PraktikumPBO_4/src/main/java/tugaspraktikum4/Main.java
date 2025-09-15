/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum4;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Buat objek pekerja
        Pekerja programmer = new Pekerja("Hanif", 18, "Programmer", 10000000);

        // Tampilkan informasi
        System.out.println("Informasi Pekerja:");
        System.out.println(programmer.toString());

        // Ubah nama menggunakan setter
        programmer.setNama("Abdillah");
        System.out.println("\nPekerja setelah diubah namanya:");
        System.out.println(programmer.toString());

        // Coba akses langsung atribut
        // programmer.nama = "Alatas"; // ERROR → nama private
        // programmer.gaji = 20000000; // ERROR → gaji private
        programmer.usia = 20; // BISA → usia protected (akses langsung di package yang sama)
        programmer.pekerjaan = "ML Engineer"; // BISA → pekerjaan public

        System.out.println("\nSetelah modifikasi:");
        System.out.println(programmer.toString());
    }
}
