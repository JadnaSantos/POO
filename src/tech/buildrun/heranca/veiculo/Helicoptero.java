package tech.buildrun.heranca.veiculo;

public class Helicoptero extends VeiculoAereo{

    private int numeroHelices;

    public Helicoptero(String marca, int anoFabricacao, int altitudeMaxima, int autonomia, int numeroHelices) {
        super(marca, anoFabricacao, altitudeMaxima, autonomia);
        this.numeroHelices = numeroHelices;
    }

    public void pairar () {
        System.out.println("Pairando...");
    }
}
