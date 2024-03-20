// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 19-03-2024
// Deskripsi    : representasi dari objek wali mahasiswa, turunan orang

package org.walimahasiswa;
import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat){
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp() {
        return nomorHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Nomor HP: " + getNomorHp());
        System.out.println("Alamat: " + getAlamat());
        
    }

}
