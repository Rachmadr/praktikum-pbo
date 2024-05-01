// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas abstrak untuk list

import java.util.ArrayList;

public abstract class List {
    protected ArrayList<Object> list;

    protected List(){
        list = new ArrayList<>();
    }

    public Object getElmt(int i){
        return list.get(i);
    }

    public int getSize(){
        return list.size();
    }

    public void add(Object e){
        list.add(e);
    }

    public abstract void del();
    public abstract void cetak();
}
