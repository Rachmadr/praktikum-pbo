// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 12-05-2024
// Deskripsi    : kelas generic data

public class Data<T> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}
