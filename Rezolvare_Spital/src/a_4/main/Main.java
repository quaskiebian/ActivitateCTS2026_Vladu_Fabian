package a_4.main;

import a_4.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta retetaInitiala = new Reteta("Paracetamol", 10.5f, 5.5f, 20.0f);
        System.out.println(retetaInitiala);

        Reteta retetaClonata = (Reteta) retetaInitiala.clonare();
        retetaClonata.setDenumireMedicament("Nurofen");

        System.out.println(retetaClonata);
    }
}
