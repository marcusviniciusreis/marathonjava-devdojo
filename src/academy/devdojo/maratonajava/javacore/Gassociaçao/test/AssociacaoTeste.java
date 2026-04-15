package academy.devdojo.maratonajava.javacore.Gassociaçao.test;

import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociaçao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das lranjeiras");
        Aluno aluno = new Aluno("Asta", 17);
        Professor professor = new Professor("Yuno", "Mago");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Capital da magia", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
