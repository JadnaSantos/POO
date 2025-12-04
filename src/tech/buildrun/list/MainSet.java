package tech.buildrun.list;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    static void main(String[] args) {
        Set<String> conjuntosFruta = new HashSet<>();

        conjuntosFruta.add("Banana");

        System.out.println(conjuntosFruta);

        System.out.println(conjuntosFruta.contains("AMORA"));
    }
}
