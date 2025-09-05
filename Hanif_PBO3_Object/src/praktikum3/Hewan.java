package praktikum3;

public class Hewan {
    private String nama;
    private int umur;

    // constructor
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // getter & setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // method
    public void suara() {
        System.out.println("Hewan bersuara");
    }

    public void berlari() {
        System.out.println("Hewan sedang berlari");
    }

    public void info() {
        System.out.println("Nama Hewan: " + getNama());
        System.out.println("Umur Hewan: " + getUmur() + " tahun");
    }
}