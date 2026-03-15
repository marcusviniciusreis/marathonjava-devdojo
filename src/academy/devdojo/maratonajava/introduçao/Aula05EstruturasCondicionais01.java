package academy.devdojo.maratonajava.introduçao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;
        // !(operador negaçao)

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica!");
        }else{
            System.out.println("Não autorizado a comprar bebida alcoolica!");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcoolica!");
        }
        boolean c = false;
        if (c = true){
            System.out.println("Dentro de algo que nunca deve ser feito!");
        }

        System.out.println("fora do if");
    }
}
