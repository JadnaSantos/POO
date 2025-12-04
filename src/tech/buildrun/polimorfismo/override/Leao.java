package tech.buildrun.polimorfismo.override;

public class Leao extends Animal{

    public Leao(String name) {
        super(name);
    }


    @Override
    public void emitirSom() {
        System.out.println("Rooaarrhhhh!!");
    }

}
