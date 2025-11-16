/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {

        Pembayaran Laptop = new Elektronik();
        Pembayaran Kue = new Makanan();

        double hargaLaptop = 2000000; 
        double hargaKue = 50000;      

        double pajakLaptop = Laptop.hitungPajak(hargaLaptop);
        double pajakKue = Kue.hitungPajak(hargaKue);

        double totalLaptop = hargaLaptop + pajakLaptop;
        double totalKue = hargaKue + pajakKue;

        System.out.println("Harga Laptop : Rp " + hargaLaptop);
        System.out.println("Pajak : Rp " + pajakLaptop);
        System.out.println("Total : Rp " + totalLaptop);

        System.out.println();

        System.out.println("Harga Kue : Rp " + hargaKue);
        System.out.println("Pajak : Rp " + pajakKue);
        System.out.println("Total : Rp " + totalKue);
    }
}