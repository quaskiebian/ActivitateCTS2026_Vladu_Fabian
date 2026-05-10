package main;

import clase.ProbaOrala;
import clase.ProbaScrisa;
import clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Fabian");
        student.examinare();

        System.out.println("\n------\n");
        student.setStrategie(new ProbaOrala());
        student.examinare();

        System.out.println("\n------\n");
        student.setStrategie(new ProbaScrisa());
        student.examinare();

    }
}