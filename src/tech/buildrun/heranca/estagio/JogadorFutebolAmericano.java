package tech.buildrun.heranca.estagio;

public class JogadorFutebolAmericano extends Jogador {

    private String listaJogadas;
    private int jardasConquistadas;

    public JogadorFutebolAmericano(String nome, int numero, String listaJogadas, int jardasConquistadas) {
        super(nome, numero);
        this.listaJogadas = listaJogadas;
        this.jardasConquistadas = jardasConquistadas;
    }

    public void fazerTouchDown() {

        System.out.println("Touch Down");
    }

    public void bloquear () {

        System.out.println("Jogadas bloqueadas");
    }

    public void correrJardas (int jardasInt) {
       this.jardasConquistadas += jardasInt;
    }

    @Override
    public String toString() {
        return "JogadorFutebolAmericano{" +
                "listaJogadas='" + listaJogadas + '\'' +
                ", jardasConquistadas=" + jardasConquistadas +
                ", name='" + name + '\'' +
                ", numero=" + numero +
                '}';
    }
}
