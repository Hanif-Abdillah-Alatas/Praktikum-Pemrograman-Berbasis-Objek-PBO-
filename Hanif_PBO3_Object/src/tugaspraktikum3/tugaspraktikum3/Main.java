package tugaspraktikum3;

public class Main {
    public static void main(String[] args) {
        // membuat objek mobil
        Mobil mobil1 = new Mobil("Toyota", "Supra", 2020, "Merah");
        Mobil mobil2 = new Mobil("Nissan", "GTR", 2022, "Silver");

        // menampilkan info mobil
        mobil1.displayInfo();
        mobil2.displayInfo();

        // menyalakan mesin
        mobil1.startEngine();
        mobil2.startEngine();

        // ubah warna mobil1
        mobil1.setWarna("Biru");
        System.out.println("Setelah diubah warna:");
        mobil1.displayInfo();
    }
}
