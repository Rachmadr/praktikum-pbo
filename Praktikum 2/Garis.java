// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 28-02-2024
// Deskripsi    : Kelas yang berisi program kelas garis

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    static int counterGaris;

    public Garis(){
        titikAwal = new Titik();
        titikAkhir = new Titik();
        counterGaris++;
    }
    
    public Garis(Titik titikAwal, Titik titikAkhir){
        // this.titikAwal = new Titik(titikAwal.getAbsis(),titikAwal.getOrdinat());
        // this.titikAkhir = new Titik(titikAkhir.getAbsis(),titikAkhir.getOrdinat());
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public float getPanjang(){
        return (float) Math.sqrt(Math.pow(titikAkhir.getOrdinat()-titikAwal.getOrdinat(),2) + Math.pow(titikAkhir.getAbsis()-titikAwal.getAbsis(),2));
    }

    public double getGradien(){
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return deltaY / deltaX;
    }

    public Garis getRefleksiY(){
        Titik t1 = titikAwal.getRefleksiY();
        Titik t2 = titikAkhir.getRefleksiY();
        Garis Gb = new Garis(t2, t1);
        return Gb;
    }

    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

}
