package tech.buildrun.polimorfismo.override;

public class Cachorro extends Animal {

    public Cachorro(String name) {
        super(name);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }
}
