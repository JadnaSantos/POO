package tech.buildrun.cafeteira;

public enum ModoCafe {

    EXPRESSO("Café expresso"),
    AMERICANO("Café americano"),
    PINGADO("Café pingado");


    private String description;

    ModoCafe (String description) {
        this.description = description;
    }

    public String getDescricao() {
        return this.description;
    }
}
