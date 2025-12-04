package tech.buildrun.heranca.estagio;

public class JogadorBasquete extends Jogador {

    private int alturaSalto;
    private int totalCestas;

    public JogadorBasquete(String nome, int numero, int alturaSalto, int totalCestas) {
        super(nome, numero);
        this.alturaSalto = alturaSalto;
        this.totalCestas = totalCestas;
    }


    public void arremessar() {

        System.out.println("Arremessando a bola...");
    }

    public void fazerEnterradas() {
        this.totalCestas++;
    }

    @Override
    public String toString() {
        return "JogadorBasquete{" +
                "alturaSalto=" + alturaSalto +
                ", totalCestas=" + totalCestas +
                ", name='" + name + '\'' +
                ", numero=" + numero +
                '}';
    }
}
