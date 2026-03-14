package academy.devdojo.maratonajava.introduçao;
/*
Pratica 01

Crie variaveis para os campos descritow abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salario de <salario>,na data <data>.
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Sasuke";
        String endereco = "Vila da Folha, 1130 - BH";
        float salario = 2534.12F ;
        String dataRecebimento = "10/01/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salario de "+salario+", na data "+dataRecebimento+".";
        System.out.println(relatorio);
    }
}
