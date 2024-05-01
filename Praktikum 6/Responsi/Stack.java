// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas abstrak untuk Stack yang mewarisi kelas abstrak List

public abstract class Stack extends List {
    public Object getTop(){
        return list.getLast();
    }
}
