// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 09-03-2024
// Deskripsi    : Kelas yang berisi kelas Anggota

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;
    
    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        // TODO 3: Buat kondisi untuk mencegah buku yang tidak tersedia dipinjam dengan throw keyword
        if(buku.isTersedia()==false){
            throw new BukuTidakTersediaException("Buku tidak tersedia");
        }
        // TODO 2: Buat kondisi untuk mencegah jumlah buku yang dipinjam melebihi 3 dengan throw keyword
        if(getJumlahBukuPinjaman()==3){
            throw new MaksimumBukuTerpinjamException("Buku yang dipinjam melebihi 3");
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }

    public void cetakKeteranganAnggota(){
        System.out.println("\nAnggota: " + getNama() + "\nBuku: ");
        if(getJumlahBukuPinjaman()>0){
            for(int i=0; i<=getJumlahBukuPinjaman()-1; i++){
                    if(bukuPinjaman[i]!=null){
                        System.err.println(bukuPinjaman[i].getJudul());
                    }
                }
        }
    }
}
    