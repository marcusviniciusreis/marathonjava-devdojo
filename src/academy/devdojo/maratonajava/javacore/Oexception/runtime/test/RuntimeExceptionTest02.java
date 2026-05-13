package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado!");
    }
    private static int divisao(int a, int b) {
        if (b==0){
            throw new ArithmeticException("Argumento ilegal, b tem que ser diferente de 0");
        }
        return a/b;
    }
}
