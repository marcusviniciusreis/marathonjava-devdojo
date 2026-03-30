package academy.devdojo.maratonajava.javacore.Gassociaçao.test;

import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
