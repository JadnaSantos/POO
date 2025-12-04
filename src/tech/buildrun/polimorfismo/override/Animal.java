package tech.buildrun.polimorfismo.override;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void emitirSom() {
        System.out.println("Som genérico!");
    }
}
