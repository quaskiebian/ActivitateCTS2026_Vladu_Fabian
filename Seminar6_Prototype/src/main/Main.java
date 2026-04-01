package main;

import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Anghel", 12, 24, "00000");
        Rezervare r1 = (Rezervare) rezervare.clonare();

        r1.setNrPersoane(20);
        System.out.println(rezervare);
        System.out.println(r1);
    }
}