package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estatico da superclasse é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estatico da subclasse é executado quando a JVM carregar a classe filha
    // 2 - alocado espaço em memoria pro objeto da superclasse
    // 3 - cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem que aparece
    // 5 - Contrustor da superclasse é executado
    // 6 - alocado espaço em memoria pro objeto da subclasse
    // 7 - cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem que aparece
    // 9 - Contrustor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
