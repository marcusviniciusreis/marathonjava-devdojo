package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.nome = "Luffy";
        student.idade = 21;
        student.sexo = 'F';

        System.out.println(student.nome);
        System.out.println(student.idade);
        System.out.println(student.sexo);
        System.out.println(student);
    }
}
