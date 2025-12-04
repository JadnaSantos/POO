package tech.buildrun.fazenda;

public class Main {

    static void main(String[] args) {
        Galinheiro granjaFeliz = new Galinheiro(
                "Granja Flor de Maio",
                50,
                3
        );

        Galinheiro granjaOvosDeOuro = new Galinheiro(
                "Granja da Gracyanne Barbosa",
                10,
                1
        );

        granjaFeliz.mostrarInfo();
        granjaOvosDeOuro.mostrarInfo();
    }
}
