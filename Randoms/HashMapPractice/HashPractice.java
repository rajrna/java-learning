package HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class HashPractice {
    static void main() {
        Map<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange",0.80);
        map.put("coconut",1.0);

//        map.remove("orange");
//        System.out.println(map);
        System.out.println(map.get("apple"));

        System.out.println(map.containsKey("banana"));

        for(String key: map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
