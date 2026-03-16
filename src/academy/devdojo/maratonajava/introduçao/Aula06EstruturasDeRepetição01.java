package academy.devdojo.maratonajava.introduçao;

public class Aula06EstruturasDeRepetição01 {
     public static void main(String[] args) {
        // while, do while, for
         int count = 0;
         while(count < 10){
             System.out.println(count);
             count++;
         }
         count = 0;
         do {
             System.out.println("Dentro do do-while");
             count++;
         }while (count < 10);

         for (count=0;count<10;count++){
             System.out.println("For "+count);
         }
    }
}
