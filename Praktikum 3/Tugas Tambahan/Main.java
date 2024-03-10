// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 09-03-2024
// Deskripsi    : Program utama untuk kelas Buku dan Anggota

public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Buku buku1;
        Buku buku2;
        Buku buku3;
        Buku buku4;
        Buku buku5;
        Buku buku6;
        Anggota a1;
        Anggota a2;

        buku1 = new Buku("Before Sun and Moon");
        buku2 = new Buku("Rex Incognito");
        buku3 = new Buku("The Tale of Shiruyeh and Shirin");
        buku4 = new Buku("A Thousand Nights");
        buku5 = new Buku("Time Trekker");
        buku6 = new Buku("The History of the Decline and Fall of Remuria");

        a1 = new Anggota("Yuki");
        a2 = new Anggota("Itsu");

        // TODO 4: Buat implementasi try-catch untuk handling exception pada saat melakukan peminjaman buku
        // Buat dua block catch: ketika anggota sudah meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam
        try{
            a1.pinjamBuku(buku1);
            a1.pinjamBuku(buku3);
            a1.pinjamBuku(buku6);
            //a1.pinjamBuku(buku4);
            a2.pinjamBuku(buku4);
            a2.pinjamBuku(buku2);
            a2.pinjamBuku(buku1);
        } catch(MaksimumBukuTerpinjamException pj){
            System.out.println(pj.getMessage());
        } catch(BukuTidakTersediaException pj){
            System.out.println(pj.getMessage());
        } finally{
            a1.cetakKeteranganAnggota();
            a2.cetakKeteranganAnggota();
        }

    }
}
