/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networkdevicesystem;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class DeviceManager {
    
    // Fungsi untuk menambah perangkat
    public static void tambahPerangkat(Scanner scanner) {
        if (NetworkDeviceSystem.count >= NetworkDeviceSystem.devices.length) {
            System.out.println("Kapasitas perangkat penuh.");
            return;
        }

        System.out.print("Masukkan nama perangkat: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan jenis perangkat: ");
        String type = scanner.nextLine();

        System.out.print("Masukkan alamat IP: ");
        String ipAddress = scanner.nextLine();

        NetworkDeviceSystem.devices[NetworkDeviceSystem.count++] = new NetworkDevice(name, type, ipAddress);
        System.out.println("Perangkat berhasil ditambahkan!");
    }

    // Fungsi untuk menampilkan perangkat
    public static void tampilkanPerangkat() {
        if (NetworkDeviceSystem.count == 0) {
            System.out.println("Tidak ada perangkat yang tersimpan.");
        } else {
            System.out.println("\n=== Daftar Perangkat ===");
            for (int i = 0; i < NetworkDeviceSystem.count; i++) {
                System.out.println((i + 1) + ". " + NetworkDeviceSystem.devices[i]);
            }
        }
    }

    // Fungsi untuk mengurutkan perangkat berdasarkan nama
    public static void urutkanPerangkat() {
        if (NetworkDeviceSystem.count == 0) {
            System.out.println("Tidak ada perangkat yang bisa diurutkan.");
            return;
        }

        // Bubble sort untuk mengurutkan array berdasarkan nama
        for (int i = 0; i < NetworkDeviceSystem.count - 1; i++) {
            for (int j = 0; j < NetworkDeviceSystem.count - i - 1; j++) {
                if (NetworkDeviceSystem.devices[j].getName().compareToIgnoreCase(NetworkDeviceSystem.devices[j + 1].getName()) > 0) {
                    NetworkDevice temp = NetworkDeviceSystem.devices[j];
                    NetworkDeviceSystem.devices[j] = NetworkDeviceSystem.devices[j + 1];
                    NetworkDeviceSystem.devices[j + 1] = temp;
                }
            }
        }
        System.out.println("Perangkat berhasil diurutkan berdasarkan nama.");
    }

    // Fungsi untuk mencari perangkat berdasarkan nama
    public static void cariPerangkat(Scanner scanner) {
        if (NetworkDeviceSystem.count == 0) {
            System.out.println("Tidak ada perangkat yang tersimpan.");
            return;
        }

        System.out.print("Masukkan nama perangkat yang ingin dicari: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < NetworkDeviceSystem.count; i++) {
            if (NetworkDeviceSystem.devices[i].getName().equalsIgnoreCase(searchName)) {
                System.out.println("Ditemukan: " + NetworkDeviceSystem.devices[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Perangkat dengan nama '" + searchName + "' tidak ditemukan.");
        }
    }
}

