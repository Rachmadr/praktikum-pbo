// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 24-03-2024
// Deskripsi    : kelas abstrak yang berisi abtraksi bangun datar

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}