package tech.buildrun.heranca.veiculo;

public final class CarroEsportivo extends Carro{

    private int qtdNitro;

    public CarroEsportivo(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, String tipoCombustivel, int qtdPortas, int qtdNitro) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas, tipoCombustivel, qtdPortas);
        this.qtdNitro = qtdNitro;
    }

    public void ativarNitro () {
        this.qtdNitro = 0;
    }
}
