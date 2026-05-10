package main;


import clase.Pacient;
import clase.Spital;
import proxy.ISpital;
import proxy.ProxyCuAsigurare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient("Aristotel",false);
        Spital spital=new Spital("Judetean");
        spital.interneazaPacient(pacient);

        ProxyCuAsigurare proxy=new ProxyCuAsigurare(spital);
        proxy.interneazaPacient(pacient);


    }
}