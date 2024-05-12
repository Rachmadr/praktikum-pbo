import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //inisiasi ArrayList yg hanya berisi objek String
        ArrayList<String> strings = new ArrayList<String>();

        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generic");
        //.add("praktikum");

        //menghapus elemen
        strings.remove("praktikum");
        //strings.remove("praktikum");

        //iterasi menampilkan elemen
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}
