// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas Stack of Point yang mewarisi kelas abstrak Stack

public class StackOfPoints extends Stack {
    public StackOfPoints(){};
    
    public void add(Point e){
        list.add(e);
    }
    
    @Override
    public Point getElmt(int i) {
        return (Point) list.get(i);
    }

    @Override
    public Point getTop() {
        return (Point) list.getLast();
    }

    public void del(){
        list.removeLast();
    }
    
    public void cetak(){
        for(int i=getSize()-1; i >= 0; i--){
            getElmt(i).cetak();
        }
    }
}
