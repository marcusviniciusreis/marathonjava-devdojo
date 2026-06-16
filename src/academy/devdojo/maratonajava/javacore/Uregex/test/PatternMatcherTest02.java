package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que nao for digito
        // \s = todos os espaçoes em branco \t \n \f \r
        // \S = todos caracteres não brancos
        // \w = a-z ou de A-Z, digiitos e _
        // \W = tudo que nao for incluso no \w
        String regex = "\\W";
//        String texto1 = "abaaba";
        String texto2 = "@@d_j2da\ts";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.print("Posiçoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
