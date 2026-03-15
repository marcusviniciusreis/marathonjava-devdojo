package academy.devdojo.maratonajava.introduçao;

public class Aula05EstruturasCondicionais02 {
     public static void main(String[] args) {
         // age < 15 categoria infantil
         // age >= 15 && age < 18 categoria juvenil
         // age >= 18  categoria adulto
         int age = 12;
         String categoria;

         if (age<15){
             categoria = "Categoria infantil.";
         } else if (age >= 15 && age < 18) {
             categoria = "Categoria juvenil.";
         }else{
             categoria = "Categoria adulto.";
         }

         System.out.println(categoria     );


     }
}
