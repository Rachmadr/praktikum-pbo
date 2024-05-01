// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas Queue of Number yang mewarisi kelas abstrak Queue

public class QueueOfPoints extends Queue{
    public QueueOfPoints(){};
    
    public void add(Point e){
        list.add(e);
    }
    
    @Override
    public Point getElmt(int i) {
        return (Point) list.get(i);
    }

    @Override
    public Point getHead(){
        return (Point) list.getFirst();
    }

    public Point getTail(){
        return (Point) list.getLast();
    }
    
    public void del(){
        list.removeFirst();
    }
    
    public void cetak(){
        for(int i=0; i < getSize(); i++){
            getElmt(i).cetak();;
        }
    }
}
