package tech.buildrun.heranca.estagio;

public class Main {

    static void main(String[] args) {

        JogadorFutebol bruno = new JogadorFutebol(
                "John",
                9,
                "Direito",
                20
        );

        JogadorFutebolAmericano tomBrady = new JogadorFutebolAmericano(
                "Tom Brady",
                12,
                "arquivo com a lista de jogadas",
                350
        );

        JogadorBasquete michaelJordan = new JogadorBasquete(
                "Michael Jordan",
                99,
                2,
                500
        );

        bruno.fazerGols();
        bruno.driblar();
        System.out.println(bruno.toString());

        tomBrady.correrJardas(100);
        tomBrady.fazerTouchDown();
        System.out.println(tomBrady);

        michaelJordan.arremessar();
        michaelJordan.fazerEnterradas();
        System.out.println(michaelJordan);
    }
}
