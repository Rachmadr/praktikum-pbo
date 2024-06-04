import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String,String> mahasiswaMap = new HashMap<String,String>();

        mahasiswaMap.put("24060122120014", "Rachmad Rifa'i");
        mahasiswaMap.put("24060122120015", "sander van den berg");
        mahasiswaMap.put("24060122140130", "Ilham Azrinargana Pulungan");
        
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + ": " + nama));
        mahasiswaMap.keySet().forEach((nim) -> System.out.println(nim + ": " + mahasiswaMap.get(nim)));
    }
}
