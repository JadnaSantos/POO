package tech.buildrun.heranca.estagio;

public class JogadorFutebol extends Jogador {

    private String peDominante;
    private int totalGols;



    public JogadorFutebol (String name, int numero, String peDominante, int totalGols) {
        super(name, numero);
        this.peDominante = peDominante;
        this.totalGols = totalGols;
    }


    public void driblar() {
        System.out.println("Driblando");
    }

    public void fazerGols () {
        this.totalGols++;
    }

    @Override
    public String toString() {
        return "JogadorFutebol{ " +
                "peDominante= '" + peDominante + '\'' +
                ", totalGols= " + totalGols +
                ", name= '" + name + '\'' +
                ", numero= " + numero +
                '}';
    }
}
