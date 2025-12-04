package tech.buildrun.enums;

public enum NivelAcesso {

    ADMIN("Admin"),
    USUARIO("Usuário"),
    CONVIDADO("Convidado");


    public String description;


    NivelAcesso (String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
