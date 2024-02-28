// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 28-02-2024
// Deskripsi    : Program utama dari kelas titik

public class MTitik {
    public static void main(String[] args){
        Titik t1; 
        Titik t2;
        //float counterTitik;

        t1 = new Titik();
        t2 = new Titik();

        t1.setAbsis(6);
        t1.setOrdinat(7);
        t2.setAbsis(1);
        t2.setOrdinat(4);

        Titik t3;
        t3 = new Titik(5, 6);

        double absis, ordinat;
        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();

        System.out.println("Jumlah objek titik :" + Titik.getCounterTitik());
        System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        System.out.println("Jarak ke titik pusat : " + t1.getJarakPusat());


        t3.refleksiX();
        t3.refleksiY();
        System.out.println("Refleksi t3 : (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        Titik t4 = t2.getRefleksiX();
        System.out.println("Refleksi t2 : (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
    
    
    
        /* 
        Atribut menggunakan private agar hanya dapat diakses dari kelas itu sendiri. Saat diakses melalui kelas lain diluar kelasnya tadi, maka akan terjadi error. Jika diubah menjadi public, maka semua class akan dapat mengakses atribut tersebut dan mungkin menyebabkan ketidakkonsistenan.
        
        Konstruktor dan Method sebaiknya menggunakan public supaya dapat diakses dari kelas lain, sehingga dapat digunakan pada kelas lain jika dibutuhkan. Jika dijadikan private maka akan terjadi error jika digunakan pada kelas lain sehingga hanya bisa digunakan dikelas itu sendiri.
        */ 
    
    }
    
}
