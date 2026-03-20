package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.nome = "Mestre Kami";
        teacher.idade = 140;
        teacher.sexo = 'M';

        System.out.println("Nome: "+teacher.nome+" \nIdade: "+teacher.idade+" \nSexo: "+teacher.sexo);
    }
}
