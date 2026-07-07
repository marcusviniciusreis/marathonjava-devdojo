package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DevDojoAcademy");
        Manga manga1 = new Manga(5, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(3, "Attack on titan", 9.5);
        Manga manga3 = new Manga(1, "Berserk", 3.2);
        Manga manga4 = new Manga(4, "Pokemon", 11.20);
        Manga manga5 = new Manga(2, "DBZ", 2.99);

        Map<Consumidor, Manga>  consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga2);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome()+"-"+entry.getValue().getNome());
        }
    }
}
