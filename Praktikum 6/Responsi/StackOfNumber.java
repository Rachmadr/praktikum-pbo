// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas Stack of Number yang mewarisi kelas abstrak Stack

public class StackOfNumber extends Stack {
    public StackOfNumber(){};
    
    public void del(){
        list.removeLast();
    }
    
    public void cetak(){
        for(int i=getSize()-1; i >= 0; i--){
            System.out.println(getElmt(i));
        }
    }
}
