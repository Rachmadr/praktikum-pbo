// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 06-03-2024
// Deskripsi    : Kelas yang berisi program asersi 1

public class Asersi1{
    public static void main(String[] args) {
        int x = -1;
        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert (x > 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}