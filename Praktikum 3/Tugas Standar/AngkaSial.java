// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 06-03-2024
// Deskripsi    : Kelas yang berisi kelas dan program angka sial untuk realisasi excep buatan AngkaSialException

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.err.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }
}

// Ketika terjadi eksepsi, baris 11 tidak akan tereksekusi karena masuk kedalam kondisional dan terjadi eksepsi sehingga program dibawahnya tidak dijalankan.
// Baris 20 dieksekusi karena terjadi eksepsi pada baris 18.
