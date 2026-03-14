package academy.devdojo.maratonajava.introduçao;

public class Aula04Operadores {
    // + - * /
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        double result = number1 / (double) number2;
        System.out.println(number2-number1);
        System.out.println(number2+number1);
        System.out.println(result);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // '<' '>' '<=' '>=' '==' '!='
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10!=10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // && (and) , || (or) , ! (no)
        int age = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age>=30 && salario>=4612;
        boolean isDentroDaLeiMenorQueTrinta = age<30 && salario>=3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

         boolean isPlaystationCincoCompravel = valorTotalContaCorrente>valorPlaystation || valorTotalContaPoupanca>valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double salary = 1800;
        salary += 1000;
        salary -= 1000;
        salary *= 2;
        salary /= 2;
        salary %= 2;

        System.out.println(salary);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);
        System.out.println(++contador2);
        System.out.println(contador2);


    }
}
