// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 02-03-2024
// Deskripsi    : Program utama dari kelas wali mahasiswa dan mahasiswa

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa w1;
        WaliMahasiswa w2;
        WaliMahasiswa w3;
        Mahasiswa m1;
        Mahasiswa m2;
        Mahasiswa m3;

        w1 = new WaliMahasiswa("Joko","085150091672", "Semarang");
        w2 = new WaliMahasiswa("Rudi","085200981221", "Tegal");
        w3 = new WaliMahasiswa("Rudi2","085200981221", "Tegal2");
        m1 = new Mahasiswa("Choi Soobin", "24060122120005", "Informatika", w1);
        m2 = new Mahasiswa("Vivian", "24060122130065", "Informatika", w1);
        m3 = new Mahasiswa("Vivian2", "24060122130065", "Informatika", w1);


        //Terhadap class Wali
        System.out.println("\nNama Wali: " + w1.getNama());
        System.out.println("Nomor HP: " + w1.getNomorHp());
        System.out.println("Alamat: " + w1.getAlamat());

        w3.setNama("Hanabi");
        w3.setNomorHp("081234567890");
        w3.setAlamat("Jepang");
        
        System.out.println("\nNama Wali: " + w3.getNama());
        System.out.println("Nomor HP: " + w3.getNomorHp());
        System.out.println("Alamat: " + w3.getAlamat());

        //Terhadap class Mahasiswa
        System.out.println("\nMahasiswa: " + m1.getNama() + "; " + m1.getNim() + "; " + m1.getJurusan() + "; " + m1.getWali().getNama());

        m3.setNama("Bronya");
        m3.setNim("24060123120001");
        m3.setJurusan("Informatika");
        m3.setWali(w3);

        System.out.println("\n");
        m1.cetak();
        System.out.println("\n");
        m2.cetak();
        System.out.println("\n");
        m3.cetak();
        System.out.println("\n");
    }


}
