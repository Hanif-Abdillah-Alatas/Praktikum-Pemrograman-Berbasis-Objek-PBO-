/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        // Hewan
        Hewan kucing = new Kucing("Kitty", "Persia");
        Hewan anjing = new Anjing("Helly", "Chihuahua");

        kucing.tampilkanInfo();
        System.out.println();
        anjing.tampilkanInfo();

        System.out.println("\n");

        // Kendaraan
        Mobil mobil = new Mobil("Toyota Supra", 120, 4, 4);
        SepedaMotor motor = new SepedaMotor("Honda NSX", 150, 2, "4-Tak");

        mobil.tampilkanInfo();
        System.out.println();
        motor.tampilkanInfo();
    }
}