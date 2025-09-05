package praktikum3;

public class Main {
    public static void main(String[] args) {
        // object pertama
        Hewan kucing = new Hewan("Kitty", 2);
        kucing.suara();
        kucing.info();

        // object kedua
        Hewan anjing = new Hewan("Helly", 3);
        anjing.berlari();
        anjing.info();

        // uji setter
        anjing.setNama("Snowy");
        anjing.setUmur(4);
        System.out.println("Setelah diubah:");
        anjing.info();
    }
}