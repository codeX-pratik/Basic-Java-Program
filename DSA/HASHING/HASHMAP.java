import java.util.*;

public class HASHMAP {
    public static void main(String[] args) {
     
        HashMap<String , Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US" , 140);
        map.put("China", 180);

        System.out.println(map);

        map.put("China", 240);
        System.out.println(map);

        //Search in HashMap
        if (map.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia")); 

        // Iteration in HashMap

        // // 1 way
        // for (Map.Entry<String , Integer> e : map.entrySet()) {
        //     System.out.println(e.getKey() + " : " + e.getValue());
        // }

        // // 2 way
        // Set<String> keys = map.keySet();
        // for (String k : keys) {
        //     System.out.println(k + "=" + map.get(k));
        // }


        // Remove from the HashMap
        map.remove("China");
        System.out.println(map);
    }
}
