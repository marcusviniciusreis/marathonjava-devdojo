package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que nao for digito
        // \s = todos os espaçoes em branco \t \n \f \r
        // \S = todos caracteres não brancos
        // \w = a-z ou de A-Z, digiitos e _
        // \W = tudo que nao for incluso no \w
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n.m} de n ate m
        // ()
        // | o(v|c) ovo ou oco
        // $
        // . 1.3 = 123 , 133, 1@3
        String regex = "([a-zA-Z\\d\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmain.com, 123jotaro@gmail.com, #@!zoro@mail.br, test@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posiçoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeroHex = 0x1;
        System.out.println(numeroHex);
    }
}
