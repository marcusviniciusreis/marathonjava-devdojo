package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9, 5));
        mangas.add(new Manga(3L,"Attack on titan",9.5, 0));
        mangas.add(new Manga(1L,"Berserk",3.2, 2));
        mangas.add(new Manga(4L,"Pokemon",11.20,0));
        mangas.add(new Manga(2L,"DBZ",2.99,0));

        for (Manga m: mangas){
            System.out.println(m);
        }

    }
}
