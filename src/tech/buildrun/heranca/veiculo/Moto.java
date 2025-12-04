package tech.buildrun.heranca.veiculo;

public class Moto extends VeiculoTerrestre {

    private int cilindradas;

    public Moto(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, int cilindradas) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas);
        this.cilindradas = cilindradas;
    }

    public void empinar () {
        System.out.println("empinar");
    }
}
