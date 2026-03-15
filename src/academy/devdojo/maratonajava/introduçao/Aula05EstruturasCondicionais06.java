package academy.devdojo.maratonajava.introduçao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizando switck e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //considerando 1 como domingo
        byte dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util.");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }


    }
}
