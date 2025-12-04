package tech.buildrun.cafeteira;

public class Main {

    static void main(String[] args) {


        DolceGusto dolceGusto = new DolceGusto();

        dolceGusto.ligar();
        dolceGusto.colocarCachimbo();

        dolceGusto.selecionarModo(ModoCafe.EXPRESSO);
        dolceGusto.fazerCafe();

        dolceGusto.desligar();

    }
}
