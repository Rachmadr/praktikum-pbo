// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 06-03-2024
// Deskripsi    : Kelas yang berisi program exception

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];

        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
