package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes1.add("William");
        nomes2.add("Suane");
        nomes1.add("DevDojo");
        nomes2.add("Academy");

        nomes1.addAll(nomes2);

        for (String nome: nomes1){
            System.out.println(nome);
        }
        System.out.println("--------------");

        for (int i = 0; i < nomes1.size(); i++) {
            System.out.println(nomes1.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
