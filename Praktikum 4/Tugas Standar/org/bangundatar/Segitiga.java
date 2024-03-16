// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 26-03-2024
// Deskripsi    : representasi dari objek segitiga, turunan kelas poligon

package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga berisi " + getJumlahSisi() + " sisi");
    }
}
