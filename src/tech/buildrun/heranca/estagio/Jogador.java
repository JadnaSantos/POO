package tech.buildrun.heranca.estagio;

public class Jogador {

    protected String name;
    protected int numero;



    public Jogador (String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public void treinar() {
        System.out.println("Treinando...");
    }
}
