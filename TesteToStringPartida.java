package e6;

import e6.models.Partida;

public class TesteToStringPartida {


    public static void main(String[] args) {
        Partida p = new Partida("Internacional", 3, "Flamengo", 1, "22/06/2022", "17:49");

        System.out.println(p);
    }
}