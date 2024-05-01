// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas abstrak Queue yang mewarisi kelas abstrak List

public abstract class Queue extends List{
    public Object getHead(){
        return list.getFirst();
    }

    public Object getTail(){
        return list.getLast();
    }
}
