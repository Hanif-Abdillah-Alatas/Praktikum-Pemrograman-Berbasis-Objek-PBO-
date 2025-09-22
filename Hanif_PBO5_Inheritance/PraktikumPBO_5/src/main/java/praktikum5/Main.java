/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author user
 */
public class Main {
     public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Pribadi", 60);
        kendaraan.tampilkanInfo();
        System.out.println();

        Mobil mobil = new Mobil("Toyota Supra", 160, 4);
        mobil.tampilkanInfo();
        mobil.tampilkanInfoMobil();
        System.out.println();

        SepedaMotor motor = new SepedaMotor("Suzuki Hayabusa", 200, "4-Tak");
        motor.tampilkanInfo();
    }
}
