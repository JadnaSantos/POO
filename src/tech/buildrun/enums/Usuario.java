package tech.buildrun.enums;

public class Usuario {

   public String name;
   public NivelAcesso nivelAcesso;
   public String email;

    public Usuario (String name, NivelAcesso nivelAcesso, String email) {
        this.name = name;
        this.nivelAcesso = nivelAcesso;
        this.email = email;
    }

    public NivelAcesso getNivelAcesso() {
        return this.nivelAcesso;
    }


   public String getName () {
       return this.email;
   }

    public String getEmail () {
        return this.email;
    }


    public void mostarInfo() {
        System.out.println("=================");
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Nivel de acesso: " + this.nivelAcesso.getDescription());
        System.out.println("=================");

    }
}
