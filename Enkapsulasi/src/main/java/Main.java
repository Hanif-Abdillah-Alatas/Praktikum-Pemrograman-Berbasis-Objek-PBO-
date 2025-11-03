/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        Pekerja p1 = new Pekerja("Hanif", 25, "Magelang", 7000000, "Programmer");

        // Akses data lewat method getter dan setter
        p1.tampilkanInfo();

        System.out.println("\nSetelah promosi");
        p1.setGaji(8500000);
        p1.setPekerjaan("Senior Programmer");

        p1.tampilkanInfo();
    }
}