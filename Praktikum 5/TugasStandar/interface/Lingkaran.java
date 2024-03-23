// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 24-03-2024
// Deskripsi    : kelas implementasi IArea berupa cara menghitung luas lingkaran

public class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return Math.PI*jejari*jejari;
    }
}
