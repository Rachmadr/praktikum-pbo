// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 26-03-2024
// Deskripsi    : driver class untuk poligon

package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(6, 10, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
    }
}