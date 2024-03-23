// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 24-03-2024
// Deskripsi    : implementasi cara menghitung luas lingkaran

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");

        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);

        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
    }
}
