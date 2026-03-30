package academy.devdojo.maratonajava.javacore.Gassociaçao.test;

import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Seleçao Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
