package tech.buildrun.heranca.veiculo;

public class Main {
    public static void main(String[] args) {

        CarroEsportivo carroEsportivo = new CarroEsportivo(
                "BMW",
                2025,
                "Asfalto",
                4,
                "Etanol",
                2,
                100
        );
        carroEsportivo.ligar();
        carroEsportivo.acelerar();
        carroEsportivo.freiar();
        carroEsportivo.desligar();
    }
}
