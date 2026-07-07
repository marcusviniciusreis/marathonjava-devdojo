package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("DevDojoAcademy");
        Manga manga1 = new Manga(5, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(3, "Attack on titan", 9.5);
        Manga manga3 = new Manga(1, "Berserk", 3.2);
        Manga manga4 = new Manga(4, "Pokemon", 11.20);
        Manga manga5 = new Manga(2, "DBZ", 2.99);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>>  consumidorManga = new HashMap<>();

        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }


    }
}
