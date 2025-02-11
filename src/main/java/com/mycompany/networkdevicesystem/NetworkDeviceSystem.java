/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.networkdevicesystem;

/**
 *
 * @author asus
 */
import java.util.Scanner;

public class NetworkDeviceSystem {
    static NetworkDevice[] devices = new NetworkDevice[100]; // Array untuk menyimpan perangkat
    static int count = 0; // Jumlah perangkat yang tersimpan

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MenuHelper.tampilkanMenuUtama();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (choice) {
                case 1: // Tambah perangkat
                    DeviceManager.tambahPerangkat(scanner);
                    break;

                case 2: // Tampilkan perangkat
                    DeviceManager.tampilkanPerangkat();
                    break;

                case 3: // Urutkan perangkat berdasarkan nama
                    DeviceManager.urutkanPerangkat();
                    break;

                case 4: // Cari perangkat berdasarkan nama
                    DeviceManager.cariPerangkat(scanner);
                    break;

                case 5: // Keluar
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
