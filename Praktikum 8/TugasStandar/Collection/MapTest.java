import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");

        System.out.println(map.get(1));

        Set<Integer> keys = map.keySet();
        
        for(Integer key : keys){
            System.out.print(map.get(key)+" ");
        }
    }
}
