// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 02-03-2024
// Deskripsi    : Kelas yang berisi program kelas mahasiswa

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
    
    public WaliMahasiswa getWali() {
        return wali;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama Mahasiswa : " + this.getNama());
        System.out.println("NIM : " + this.getNim());
        System.out.println("Jurusan : " + this.getJurusan());
        System.out.println("Dosen Wali : " + this.getWali().getNama());
    }
}


