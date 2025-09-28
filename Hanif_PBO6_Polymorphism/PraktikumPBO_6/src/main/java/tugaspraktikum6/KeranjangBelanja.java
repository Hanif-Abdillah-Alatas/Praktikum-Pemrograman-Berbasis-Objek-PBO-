/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author user
 */
class KeranjangBelanja {
    private Produk[] daftarProduk;
    private int jumlahProduk;

    public KeranjangBelanja(int kapasitas) {
        daftarProduk = new Produk[kapasitas];
        jumlahProduk = 0;
    }

    // Tambah produk
    public void tambahProduk(Produk p) {
        if (jumlahProduk < daftarProduk.length) {
            daftarProduk[jumlahProduk] = p;
            jumlahProduk++;
        } else {
            System.out.println("Keranjang penuh, tidak bisa menambah produk!");
        }
    }

    // Hitung total diskon
    public double hitungTotal() {
        double total = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            total += daftarProduk[i].getHargaDiskon();
        }
        return total;
    }

    // Tampilkan isi keranjang
    public void tampilkanKeranjang() {
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println(daftarProduk[i]);
        }
        System.out.println("Total Belanja Setelah Diskon: " + hitungTotal());
    }
}