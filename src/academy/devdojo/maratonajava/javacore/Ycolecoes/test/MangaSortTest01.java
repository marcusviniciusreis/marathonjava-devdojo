package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(3,"Attack on titan",9.5));
        mangas.add(new Manga(1,"Berserk",3.2));
        mangas.add(new Manga(4,"Pokemon",11.20));
        mangas.add(new Manga(2,"DBZ",2.99));
        for (Manga m: mangas){
            System.out.println(m);
        }
        Collections.sort(mangas);
        System.out.println("---------------");
        for (Manga m: mangas){
            System.out.println(m);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("---------------");
        for (Manga m: mangas){
            System.out.println(m);
        }
    }
}
