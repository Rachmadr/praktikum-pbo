// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 27-03-2024
// Deskripsi    : Kelas Point

public class Point {
    private double absis;
    private double ordinat;
    private static double counterTitik;

    public Point(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Point(double absis, double ordinat){
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
    
    public static double getCounterTitik(){
        return counterTitik;
    }

    public void cetak(){
        System.out.println("("+this.getAbsis()+","+this.getOrdinat()+")");
    }
}
