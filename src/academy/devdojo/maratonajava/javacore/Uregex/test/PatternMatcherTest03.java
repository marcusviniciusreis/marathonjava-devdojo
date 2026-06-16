package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo o que nao for digito
        // \s = todos os espaçoes em branco \t \n \f \r
        // \S = todos caracteres não brancos
        // \w = a-z ou de A-Z, digiitos e _
        // \W = tudo que nao for incluso no \w
        // []
//        String regex = "[a-zA-C]";
        String regex = "0[xX][\\da-fA-F]";
//        String texto1 = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.print("Posiçoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeroHex = 0x1;
        System.out.println(numeroHex);
    }
}
