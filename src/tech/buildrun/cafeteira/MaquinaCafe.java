package tech.buildrun.cafeteira;

public interface MaquinaCafe {

    void ligar();
    void desligar();
    void colocarCachimbo();
    void retirarCachimbo();
    void selecionarModo(ModoCafe modoCafe);
    void fazerCafe();

}
