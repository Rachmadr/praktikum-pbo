// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 19-03-2024
// Deskripsi    : driver dari kelas mahasiswa dan wali mahasisa

package org.main;
import org.mahasiswa.*;
import org.walimahasiswa.*;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1;
        Mahasiswa mhs2;
        Mahasiswa mhs3;

        WaliMahasiswa doswal1;
        WaliMahasiswa doswal2;
        WaliMahasiswa doswal3;

        doswal1 = new WaliMahasiswa("Prabu", "8918001", "085298700122", "Denpasar");
        doswal2 = new WaliMahasiswa("Wisti", "9711301", "085198638882", "Cakung");
        doswal3 = new WaliMahasiswa("Solehuddin", "6177001", "085273340110", "Serang");

        mhs1 = new Mahasiswa("Pani", "1893900", "24060122120011", "Hukum", doswal1);
        mhs2 = new Mahasiswa("Muti", "3340801", "24060122130081", "Sistem Informasi", doswal2);
        mhs3 = new Mahasiswa("Nayla", "1277120", "24060122130083", "Kelautan", doswal3);
        
        System.out.println("\n");
        mhs1.cetak();
        System.out.println("\n");
        mhs2.cetak();
        System.out.println("\n");
        mhs3.cetak();
        System.out.println("\n");

    }
}
