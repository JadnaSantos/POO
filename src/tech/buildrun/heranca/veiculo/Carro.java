package tech.buildrun.heranca.veiculo;

public abstract class Carro extends VeiculoTerrestre {

    protected String tipoCombustivel;
    protected int qtdPortas;

    public Carro(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, String tipoCombustivel, int qtdPortas) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas);
        this.tipoCombustivel = tipoCombustivel;
        this.qtdPortas = qtdPortas;
    }



    public void abrirCapo () {
        System.out.println("Abrir capo");
    }
}
