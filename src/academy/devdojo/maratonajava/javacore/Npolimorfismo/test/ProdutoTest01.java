package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalandoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);
        CalandoraImposto.calcularImposto(tomate);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        CalandoraImposto.calcularImposto(computador);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        CalandoraImposto.calcularImposto(tv);


    }
}
