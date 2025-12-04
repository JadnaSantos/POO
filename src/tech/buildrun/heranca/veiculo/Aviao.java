package tech.buildrun.heranca.veiculo;

public class Aviao extends VeiculoAereo {

    private int numeroTurbinas;

    public Aviao(String marca, int anoFabricacao, int altitudeMaxima, int autonomia, int numeroTurbinas) {
        super(marca, anoFabricacao, altitudeMaxima, autonomia);
        this.numeroTurbinas = numeroTurbinas;
    }

    public void ativarPilotoAutomatico () {
        System.out.println("Ativando piloto automatico");
    }
}
