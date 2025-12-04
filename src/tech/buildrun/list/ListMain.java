package tech.buildrun.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    static void main(String[] args) {

        List<String> listaFrutas = new ArrayList<>();

        listaFrutas.add("Acabate");
        listaFrutas.add("Laranja");
        listaFrutas.add("Uva");
        listaFrutas.add("Amora");
        listaFrutas.add("Acabate");

        System.out.println(listaFrutas);


        System.out.println((listaFrutas.get(3)));


        System.out.println(listaFrutas);

        listaFrutas.remove(2);

        System.out.println(listaFrutas);

    }
}
