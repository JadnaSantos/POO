package tech.buildrun.polimorfismo.overload;

public class Main {

    static void main(String[] args) {


        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,3));
        System.out.println(calculadora.somar(2.2,3.2));
    }
}
