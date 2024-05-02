// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 02-05-2024
// Deskripsi    : class Senjata

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru) {
        if(peluru < 0){
            peluru = 0;
        }
        this.peluru = peluru;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
}
