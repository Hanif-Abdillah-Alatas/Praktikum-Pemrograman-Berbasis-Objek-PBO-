/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", 180, "Bensin", 4);
        Mobil mobil2 = new Mobil("Nissan", 200, "Solar", 2);

        // Menampilkan informasi mobil
        System.out.println("Info Mobil 1");
        mobil1.InfoMobil();

        System.out.println("\nInfo Mobil 2");
        mobil2.InfoMobil();
    }
}
