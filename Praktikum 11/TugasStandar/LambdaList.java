import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Arga");
        mahasiswaList.add("Babi");
        mahasiswaList.add("Cedric");
        mahasiswaList.add("Dapid");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
