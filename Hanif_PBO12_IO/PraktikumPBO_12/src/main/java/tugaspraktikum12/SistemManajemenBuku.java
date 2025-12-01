/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum12;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemManajemenBuku {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistem Manajemen Buku");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan Buku ke File Teks");
            System.out.println("3. Simpan Buku ke File Serial (buku.ser)");
            System.out.println("4. Tampilkan Buku di File Teks");
            System.out.println("5. Tampilkan Buku di File Serial");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanDariFileTeks();
                case 5 -> tampilkanDariFileSerial();
                case 6 -> {
                    System.out.println("Program selesai.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Tambah Buku
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Judul buku: ");
        String judul = scanner.nextLine();

        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Tahun terbit: ");
        int tahun = scanner.nextInt();

        daftarBuku.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan.");
    }

    // Simpan ke File Teks (buku.txt)
    private static void simpanKeFileTeks() {
        try (FileWriter fw = new FileWriter(TEXT_FILE)) {
            for (Buku buku : daftarBuku) {
                fw.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    // Simpan ke File Serial (buku.ser)
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {

            oos.writeObject(daftarBuku);
            System.out.println("Objek daftar buku berhasil disimpan ke buku.ser");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    // Tampilkan dari File Teks (buku.txt)
    private static void tampilkanDariFileTeks() {
        System.out.println("\nIsi File Teks (buku.txt)");
        try (BufferedReader br = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file teks.");
        }
    }

    // Tampilkan dari File Serial (buku.ser)
    private static void tampilkanDariFileSerial() {
        System.out.println("\nIsi File Serial (buku.ser)");

        try (ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {

            List<Buku> list = (List<Buku>) ois.readObject();

            for (Buku buku : list) {
                buku.tampilkanInfo();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca file serial.");
        }
    }
}