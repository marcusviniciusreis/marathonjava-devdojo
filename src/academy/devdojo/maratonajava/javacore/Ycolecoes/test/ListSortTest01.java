package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("DBZ");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(26.78);
        dinheiros.add(120.09);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        for(String manga : mangas){
            System.out.println(manga);
        }
    }
}
