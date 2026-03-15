package academy.devdojo.maratonajava.introduçao;

public class Aula05EstruturasCondicionais04 {
    // exercicio do DevDojo
    public static void main(String[] args) {
        double  salario = 36000;
        double imposto;
        if(salario>=0 && salario < 34713){
            imposto = (salario*0.097);
        } else if (salario > 34712 && salario < 68507) {
            imposto = (salario*0.3735);
        }else{
            imposto = salario*0.495;
        }
        System.out.println(imposto);
    }
}
