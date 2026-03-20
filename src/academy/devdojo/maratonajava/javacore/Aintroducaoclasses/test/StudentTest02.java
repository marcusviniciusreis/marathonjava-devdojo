package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student();

        student.nome = "Sanji";
        System.out.println(student.idade);
        System.out.println(student.sexo);
        System.out.println(student.nome);

        System.out.println(student1.idade);
        System.out.println(student1.sexo);
        System.out.println(student1.nome);
    }
}
