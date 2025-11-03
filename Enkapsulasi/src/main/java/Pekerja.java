/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
class Pekerja extends Manusia {
    private double gaji;         
    private String pekerjaan;    

    public Pekerja(String nama, int usia, String alamat, double gaji, String pekerjaan) {
        super(nama, usia, alamat); 
        this.gaji = gaji;
        this.pekerjaan = pekerjaan;
    }

    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gajiBaru) {
        if (gajiBaru > 0) {
            this.gaji = gajiBaru;
        } else {
            System.out.println("Gaji tidak boleh negatif!");
        }
    }

    // Getter dan Setter untuk pekerjaan
    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaanBaru) {
        if (pekerjaanBaru != null && !pekerjaanBaru.isEmpty()) {
            this.pekerjaan = pekerjaanBaru;
        } else {
            System.out.println("Pekerjaan tidak valid!");
        }
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji     : Rp" + gaji);
    }
}