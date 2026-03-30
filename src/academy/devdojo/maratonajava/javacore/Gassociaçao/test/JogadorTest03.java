package academy.devdojo.maratonajava.javacore.Gassociaçao.test;

import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-----Jogador-----");
        jogador.imprime();

        System.out.println("-----Time-----");
        time.imprime();
    }
}
