package tech.buildrun.list;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    static void main(String[] args) {

        Map<String, String> mapaFrutas = new HashMap<>();

        mapaFrutas.put("A", "Acabaxi");
        mapaFrutas.put("B", "Banana");

        System.out.println(mapaFrutas.isEmpty());


        System.out.println(mapaFrutas.get("B"));
        System.out.println(mapaFrutas);
    }
}
