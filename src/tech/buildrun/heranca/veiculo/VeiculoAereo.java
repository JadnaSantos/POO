package tech.buildrun.heranca.veiculo;

public class VeiculoAereo extends Veiculo{

    protected int altitudeMaxima;
    protected int autonomia;

    public VeiculoAereo(String marca, int anoFabricacao, int altitudeMaxima, int autonomia) {
        super(marca, anoFabricacao);
        this.altitudeMaxima = altitudeMaxima;
        this.autonomia = autonomia;
    }

    public void decolar () {
        System.out.println("Decolando...");
    }

    public void pousar () {
        System.out.println("Pousando...");
    }
}
