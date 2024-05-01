// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas Queue of Point yang mewarisi kelas abstrak Queue

public class QueueOfNumber extends Queue{
    public QueueOfNumber(){};
    
    public void del(){
        list.removeFirst();
    }
    
    public void cetak(){
        for(int i=0; i < getSize(); i++){
            System.out.println(getElmt(i));
        }
    }
}
