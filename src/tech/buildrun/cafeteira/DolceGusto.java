package tech.buildrun.cafeteira;

public class DolceGusto implements MaquinaCafe {


    private boolean ligada;
    private boolean resistenciaLigada;
    private boolean possuiCachimbo;
    private ModoCafe modoCafeSelecionado;
    private int qtdAguaCaldeira;

    @Override
    public void ligar() {
        System.out.println("Ligando DolceGusto...");
        this.ligada = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando DolceGusto...");
        this.ligada = false;
    }

    @Override
    public void colocarCachimbo() {
        System.out.println("Cachimbo inserido...");
        this.ligada = true;
    }

    @Override
    public void retirarCachimbo() {
        System.out.println("Cachimbo removido...");
        this.possuiCachimbo = false;
    }

    @Override
    public void selecionarModo(ModoCafe modoCafe) {
        System.out.println("Modo de café selecionado" + modoCafe.getDescricao());
        this.modoCafeSelecionado = modoCafe;
    }

    @Override
    public void fazerCafe() {
        if (this.isLigada()) {
            if (this.isPossuiCachimbo()) {
                if (this.modoCafeSelecionado != null) {
                    this.injetarAguaCaldeira();
                    this.ligarResistencia();
                    System.out.println("Fazendo " + this.modoCafeSelecionado.getDescricao() + "...");
                    System.out.println("Café pronto!");
                    this.esvaziarCaldeira();
                    this.desligarResistencia();
                } else {
                    System.out.println("Modo de Cafe não foi selecionado. Selecione antes de prosseguir.");
                }
            } else {
                System.out.println("Dolce Gusto está sem o cachimbo. Coloque o cachimbo com o pó de café.");
            }
        } else {
            System.out.println("Dolce Gusto está desligada.");
        }
    }
    private boolean isLigada () {
        return this.ligada;
    }

    private boolean isPossuiCachimbo () {
        return this.possuiCachimbo;
    }


    private void injetarAguaCaldeira() {
        System.out.println("Injetando " + 300 + "ml de agua na caldeira...");
        this.qtdAguaCaldeira = 300;
    }

    private void esvaziarCaldeira () {
        System.out.println("Esvaziando a caldeira");
        this.qtdAguaCaldeira = 0;


        System.out.println("Caldeira esvaziada...");
    }

    private void ligarResistencia () {
        System.out.println("Ligando a resistencia");

        this.resistenciaLigada = true;
    }

    private void desligarResistencia () {
        System.out.println("Desligando a resistencia");

        this.resistenciaLigada = false;
    }
}
