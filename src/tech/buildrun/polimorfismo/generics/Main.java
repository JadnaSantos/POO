package tech.buildrun.polimorfismo.generics;

public class Main {

    static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>();

        caixaTexto.guardar("Hello world");

        System.out.println(caixaTexto.pegar());


        Caixa<Integer> caixaNumero = new Caixa<>();

        caixaNumero.guardar(1);

        System.out.println(caixaNumero.pegar());



    }
}
