package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(3,"Attack on titan",9.5));
        mangas.add(new Manga(1,"Berserk",3.2));
        mangas.add(new Manga(4,"Pokemon",11.20));
        mangas.add(new Manga(2,"DBZ",2.99));

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        mangas.sort(mangaByIdComparator);

        for (Manga m: mangas){
            System.out.println(m);
        }
        Manga  mangaToSearch = new Manga(2, "DBZ", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
