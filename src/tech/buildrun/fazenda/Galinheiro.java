package tech.buildrun.fazenda;

import java.time.LocalDateTime;

public class Galinheiro {


    private String nome;
    private int qtdGalinhas;
    private int ovosPorDiaPorGalinha;
    private LocalDateTime dataHoraCriacao;



    public Galinheiro (String nome,
                       int qtdGalinhas,
                       int ovosPorDiaPorGalinha) {
        this.nome = nome;
        this.qtdGalinhas = qtdGalinhas;
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
        this.dataHoraCriacao = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdGalinhas() {
        return qtdGalinhas;
    }

    public void setQtdGalinhas(int qtdGalinhas) {
        this.qtdGalinhas = qtdGalinhas;
    }

    public int getOvosPorDiaPorGalinha() {
        return ovosPorDiaPorGalinha;
    }

    public void setOvosPorDiaPorGalinha(int ovosPorDiaPorGalinha) {
        this.ovosPorDiaPorGalinha = ovosPorDiaPorGalinha;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public int calcularProducaoDiaria() {
        return this.qtdGalinhas * this.ovosPorDiaPorGalinha;
    }

    public int calcularProducaoMensal() {
        return this.calcularProducaoDiaria() * 30;
    }

    public void mostrarInfo() {
        System.out.println("================");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Quantidade de Galinhas: "+ this.qtdGalinhas);
        System.out.println("Quantidade de Ovos por Dia por Galinha: "+ this.ovosPorDiaPorGalinha);
        System.out.println("Data e Hora da Criação: "+ this.dataHoraCriacao);
        System.out.println("Produção Diária de Ovos: "+ this.calcularProducaoDiaria() + " ovos");
        System.out.println("Produção Mensal de Ovos: "+ this.calcularProducaoMensal() + " ovos");
        System.out.println("================");
    }
}
