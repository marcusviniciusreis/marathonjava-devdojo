package academy.devdojo.maratonajava.javacore.Zgenerics;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");


        add(lista, new Consumidor("Midoriya"));

        for (Object o: lista){
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}

