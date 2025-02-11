/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.networkdevicesystem;

/**
 *
 * @author asus
 */
public class NetworkDevice {
    private final String name;
    private final String type;
    private final String ipAddress;

    // Constructor
    public NetworkDevice(String name, String type, String ipAddress) {
        this.name = name;
        this.type = type;
        this.ipAddress = ipAddress;
    }

    // Getter untuk nama perangkat
    public String getName() {
        return name;
    }

    // Method untuk mendapatkan representasi perangkat dalam bentuk string
    @Override
    public String toString() {
        return "Nama: " + name + ", Jenis: " + type + ", IP Address: " + ipAddress;
    }
}
