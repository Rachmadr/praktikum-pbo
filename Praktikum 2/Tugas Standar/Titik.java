// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 28-02-2024
// Deskripsi    : Kelas yang berisi program kelas titik

public class Titik {
    private double absis;
    private double ordinat;
    static int counterTitik;

    public Titik(){
        this(0, 0);
        counterTitik++;
    }

    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    public void setAbsis(double absis){
        this.absis = absis;
    }

    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }
    
    public static int getCounterTitik(){
        return counterTitik;
    }

    //prak2
    public float getJarakPusat(){
        return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public void refleksiX(){
        ordinat = -1 * ordinat;
    }

    public void refleksiY(){
        absis = -1 * absis;
    }

    public Titik getRefleksiX(){
        Titik t = new Titik(this.absis, -(this.ordinat));
        return t;
    }

    public Titik getRefleksiY(){
        Titik t = new Titik(-(this.absis), this.ordinat);
        return t;
    }


}
