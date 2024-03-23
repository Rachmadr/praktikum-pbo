// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 24-03-2024
// Deskripsi    : kelas implementasi metode abstrak pada bangun datar

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");

        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi" + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
