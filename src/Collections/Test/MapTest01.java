package Collections.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você");
        //System.out.println(map);
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("-------------");

//        for (String value : map.values()) {
//            System.out.println(value);
//        }
        map.values().forEach(value -> System.out.println(value));


        System.out.println("----------");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
