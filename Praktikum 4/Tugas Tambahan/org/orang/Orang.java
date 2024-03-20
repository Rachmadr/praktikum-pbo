// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 19-03-2024
// Deskripsi    : representasi dari objek mahasiswa

package org.orang;

public class Orang {
    protected String nama;
    protected String nik;

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void cetak(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
    }
}