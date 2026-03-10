package main;

import clase.Aplicant;
import clase.readers.ReaderAngajati;
import clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        Aplicant.setPragPunctaj(85);
        try {
            ReaderAplicanti ra= new ReaderAngajati("Seminar_2/angajati.txt");
            listaAngajati=ra.readAplicanti();
            for(Aplicant aplicant:listaAngajati) {
                System.out.println(aplicant.toString());
                aplicant.afisareVenit();
                aplicant.afisareStatut();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch blk
            e.printStackTrace();
        }
    }
}