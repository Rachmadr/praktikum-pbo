// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 02-05-2024
// Deskripsi    : class Kontorl Senjata

public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(senjata.getPeluru()+jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(senjata.getPeluru() == 0){
            System.out.println("Peluru Habis");
        }
        else{
            for(int i = 0; i < jumlah; i++){
                if(isAdaPeluru()){
                    System.out.println(senjata.getBunyi() + " ");
                    senjata.setPeluru(senjata.getPeluru()-1);
                }
                else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
    
    public void pasangBayoret(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb!";
        }else{
            return "Gagal, belum pasang bayonet";
        }
    }
}
