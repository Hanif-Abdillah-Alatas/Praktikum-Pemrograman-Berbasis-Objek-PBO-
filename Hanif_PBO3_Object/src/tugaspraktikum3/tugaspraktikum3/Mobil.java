package tugaspraktikum3;

public class Mobil {
    // atribut
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    // constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // getter dan setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // method tambahan
    public void startEngine() {
        System.out.println("Mesin mobil " + getMerk() + " menyala");
    }

    public void displayInfo() {
        System.out.println("Merk  : " + getMerk());
        System.out.println("Model : " + getModel());
        System.out.println("Tahun : " + getTahun());
        System.out.println("Warna : " + getWarna());
        System.out.println("------------------------");
    }
}
