// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 06-03-2024
// Deskripsi    : Kelas yang berisi kelas lingkaran dan program asersi 1

class Lingkaran{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari harus positif!!"; //salah pesan harusnya tidak boleh nol dan negatif
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}
